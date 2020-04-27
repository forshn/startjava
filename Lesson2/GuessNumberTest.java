import java.util.*;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scan.next());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.next());

        GuessNumber game = new GuessNumber(player1, player2);

        do {
            game.startGame();
            String answer;
            do {
                System.out.println("Хотите продолжить, yes/no?");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            if (answer.equals("no")) {
                break;
            }
        } while (true);
    }
}
