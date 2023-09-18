//     PriorityQueue&lt;Integer&gt; pq = new PriorityQueue&lt;&gt;(Comparator.reverseOrder());
// pq.add(25);
// pq.add(30);
// pq.add(20);

// System.out.println(pq); // Вывод: [30, 25, 20]
// Метод add() просто выбрасывает исключение IllegalStateException, если в PriorityQueue нет места. С другой стороны, метод offer() возвращает false в этой ситуации, не вызывая исключение.

// import java.util.ArrayList;
// import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
// import Games;

public class InterfaceInputGame {
    public void runMeaning(Integer countTry) {
        Integer id = 1;
        Double ver;
        Queue<Games> gamesPriorityQueue = new PriorityQueue<>(countTry);
    
        while (true) {
            String command= prompt("Введите игрушку или напишите exit");
            if (command == "exit" || command == "Exit" || command == "EXIT")
                return;
            else{
                ver = Double.valueOf(prompt("введите вероятность"));
            }
            Games game = new Games(id,command,ver); // не создаёт л одно и то;е несколько раз?
            gamesPriorityQueue.add(game);
            id++;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void runProb() {
    }

    public Queue<Games> deleteGame(Queue<Games> gamesPriorityQueue){
        gamesPriorityQueue.remove();
        return gamesPriorityQueue;
    }


}
