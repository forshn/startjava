import java.util.*;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);
    static GuessNumber game = new GuessNumber();

    public static void main(String[] args) {
        boolean ifNo = true;
        do {
            game.startGame();
            boolean isAnswer = true;
            do {
                System.out.println("Хотите продолжить, yes/no?");
                String answer = scan.next();

                if (answer.equals("yes")) {
                    isAnswer = false;
                } else if (answer.equals("no")) {
                    isAnswer = false;
                    ifNo = false;
                } else {
                }
            } while (isAnswer == true);
        } while (ifNo == true);
    }
}
