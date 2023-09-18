import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Games> gamesWinner = new ArrayList<Games>();
        String count = InterfaceInputGame.prompt(" Сколько раз будет проходить розыгрыш:  ");
        Integer counting = 0;
        try {
            counting = Integer.parseInt(count);
            if (counting < 1)
                System.out.println("Количество розыгрышкй дол;но быть больше единицы");
            ;
        } catch (Exception e) {
            System.out.println("Необхоодимо ввести целочисленное число ");
        }
        Queue<Games> gamesPriorityQueue = InterfaceInputGame.runMeaning();
        for (int i = 0; i < counting; i++) {
            gamesWinner.add(InterfaceLottery.main(gamesPriorityQueue));
        }
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("winners.txt"));
        for (Games games : gamesWinner) {
            outputWriter.write("The winner is " + games.name());
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();

    }

}
