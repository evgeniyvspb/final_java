import java.util.Queue;

public class InterfaceLottery {
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
