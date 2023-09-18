import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class InterfaceInputGame {
    public static Queue<Games> runMeaning() {
        Integer id = 1;
        Double ver;
        String countGames= prompt("Введите количество игрушек для розыгрыша:  ");
        Integer countTry=0;
        try {
            countTry = Integer.parseInt(countGames);
            if (countTry < 1)
                System.out.println("Количество игрушек дол;но быть больше единицы");
        } catch (Exception e) {
            System.out.println("Необхоодимо ввести целочисленное число ");
        }

        Queue<Games> gamesPriorityQueue = new PriorityQueue<>(countTry, idComparator);
        while (id<=countTry) {
            String command= prompt("Введите игрушку:  ");
            ver = Double.valueOf(prompt("введите вероятность:  "));
            Games game = new Games(id,command,ver); 
            gamesPriorityQueue.offer(game);
            id++;
        }
        return gamesPriorityQueue;
    }

    static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    
    //Анонимный класс компаратора
    public static Comparator<Games> idComparator = new Comparator<Games>(){
        @Override
        public int compare(Games c1, Games c2) {
            return (int) (c2.getProbability() - c1.getProbability());
        }
    };
}
