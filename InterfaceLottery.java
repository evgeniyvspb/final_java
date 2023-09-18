// Критерии оценки
// Приложение должно запускаться, записывать значения в файл.

import java.util.Queue;

public class InterfaceLottery {
//      public Queue<Games> deleteGame(Queue<Games> gamesPriorityQueue){
//         gamesPriorityQueue.remove();
//         return gamesPriorityQueue;
//     }
    
    public static Games lottery(Queue<Games> gamesPriorityQueue){
        return gamesPriorityQueue.poll();
    }

    public static Games main(Queue<Games> gamesPriorityQueue) {
        System.out.println("Лотерея начинается");
        Games gameWinner = lottery(gamesPriorityQueue);
        String name_Game = gameWinner.name();
        System.out.println("Ваш приз это " + name_Game);
        return gameWinner;
    }
}
