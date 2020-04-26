import java.util.*;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);
    static Player player1 = new Player();
    static Player player2 = new Player();
    static GuessNumber game = new GuessNumber();

    public static void main(String[] args) {
        firstLoop:
        do {
            game.startGame();
            System.out.println("Хотите продолжить, yes/no?");
            String answer = scan.next();

            if (answer.equals("no")) {
                break;
            } else if (answer.equals("yes")) {
            } else if (!answer.equals("yes") || !answer.equals("no")) {
                do {
                    System.out.println("Хотите продолжить, yes/no?");
                    answer = scan.next();
                    if (answer.equals("no")) {
                        break firstLoop;
                    }
                    if (answer.equals("yes")) {
                        break;
                    }
                } while (true);
            }
        } while (true);
    }
}
