import java.util.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        game.startGame();

        do {
            System.out.println("Хотите продолжить, yes/no?");
            String answer = scan.next();
            if (answer.equals("no")) {
                break;
            } else if (answer.equals("yes")) {
                game.startGame();
            }
        } while (true);
    }
}
