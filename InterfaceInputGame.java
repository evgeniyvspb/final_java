//     PriorityQueue&lt;Integer&gt; pq = new PriorityQueue&lt;&gt;(Comparator.reverseOrder());
// pq.add(25);
// pq.add(30);
// pq.add(20);

// System.out.println(pq); // Вывод: [30, 25, 20]
// Метод add() просто выбрасывает исключение IllegalStateException, если в PriorityQueue нет места. С другой стороны, метод offer() возвращает false в этой ситуации, не вызывая исключение.

// import java.util.ArrayList;
// import java.util.List;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
// import java.util.Random;
import java.util.Scanner;
// import Games;

public class InterfaceInputGame {
    public static Queue<Games> runMeaning(Integer countTry) {
        Integer id = 1;
        Double ver;
        Queue<Games> gamesPriorityQueue = new PriorityQueue<>(countTry, idComparator);
    
        while (id<=countTry) {
            String command= prompt("Введите игрушку:  ");
            // if (command == "exit" || command == "Exit" || command == "EXIT")
            //     return;
            // else{
            ver = Double.valueOf(prompt("введите вероятность"));
            Games game = new Games(id,command,ver); // не создаёт л одно и то;е несколько раз?
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

    // public Queue<Games> deleteGame(Queue<Games> gamesPriorityQueue){
    //     gamesPriorityQueue.remove();
    //     return gamesPriorityQueue;
    // }
    //Анонимный класс компаратора
    public static Comparator<Games> idComparator = new Comparator<Games>(){
         
        @Override
        public int compare(Games c1, Games c2) {
            return (int) (c2.getProbability() - c1.getProbability());
        }
    };
}
