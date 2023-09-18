
// import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Games> gamesWinner = new PriorityQueue<>();
        String count = InterfaceInputGame.prompt(" Сколько раз будет проходить розыгрыш ");
        Integer counting = 0;
        try {
            counting = Integer.parseInt(count);
            if (counting < 1)
                System.out.println("Количество розыгрышкй дол;но быть больше единицы");
            ;
        } catch (Exception e) {
            System.out.println("Необхоодимо ввести целочисленное число ");
        }
        for (int i = 0; i < counting; i++) {
            Queue<Games> gamesPriorityQueue = InterfaceInputGame.runMeaning(3);
            gamesWinner.offer(InterfaceLottery.main(gamesPriorityQueue));
        }
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("winners.txt"));
        for (int i = 0; i< counting; i++) {
            outputWriter.write(gamesWinner.poll().name());
        }
        outputWriter.newLine();
        outputWriter.flush();
        outputWriter.close();

    }

}
