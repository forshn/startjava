import java.util.*;

public class GuessNumber {
    int compNum = (int) (Math.random() * 101);

    public void startGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(sc.next());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(sc.next());

        while (true) {

            System.out.println(player1.getName() + ", введите ваше число от 0 до 100:");
            player1.setNumber(sc.nextInt());
            int player1Num = player1.getNumber();

            if (player1Num < compNum) {
                System.out.println("Введенное вами число меньше того, что загадал комьютер");

            } else if (player1Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");

            } else if (player1Num == compNum) {
                System.out.println("Вы угадали!");
                break;
            }

            System.out.println(player2.getName() + ", введите ваше число от 0 до 100:");
            player2.setNumber(sc.nextInt());
            int player2Num = player2.getNumber();

            if (player2Num < compNum) {
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
            } else if (player2Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player2Num == compNum) {
                System.out.println("Вы угадали!");
                break;
            }

            if (player1Num == compNum || player2Num == compNum) {
                break;
            }
        }
        do {
            System.out.println("Хотите продолжить, yes/no?");
            String answer = sc.next();
            if (answer.equals("no")) {
                break;
            } else if (answer.equals("yes")) {
                startGame();
            }
        } while (true);
    }
}
