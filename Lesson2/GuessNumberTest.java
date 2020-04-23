import java.util.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(sc.next());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(sc.next());

        GuessNumber player1Num = new GuessNumber();
        GuessNumber player2Num = new GuessNumber();

        do {
            System.out.println(player1.getName() + ", введите ваше число от 0 до 100:");
            player1Num.setPlayer1Num(sc.nextInt());
            player1Num.finalResultPlayer1();
            if (player1Num.getPlayer1Num() == player1Num.getCompNum()) {
              break;
            }

            System.out.println(player2.getName() + ", введите ваше число от 0 до 100:");
            player1Num.setPlayer1Num(sc.nextInt());
            player1Num.finalResultPlayer1();
            if (player2Num.getPlayer2Num() == player2Num.getCompNum()) {
              break;
            }

            System.out.println("Хотите продолжить, yes/no?");
            String answer = sc.next();
            if (!answer.equals("yes")) {
               break;
            }
        } while (true);
    }
}
