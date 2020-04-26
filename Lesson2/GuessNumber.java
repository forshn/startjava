import java.util.*;

public class GuessNumber {
    private int compNum = (int) (Math.random() * 101);
    private Scanner sc = new Scanner(System.in);

    public void startGame() {

        System.out.println("Введите имя первого игрока");
        GuessNumberTest.player1.setName(sc.next());

        System.out.println("Введите имя второго игрока");
        GuessNumberTest.player2.setName(sc.next());

        while (true) {
            System.out.println(GuessNumberTest.player1.getName() + ", введите ваше число от 0 до 100:");
            GuessNumberTest.player1.setNumber(sc.nextInt());
            int player1Num = GuessNumberTest.player1.getNumber();

            if (player1Num < compNum) {
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
            } else if (player1Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player1Num == compNum) {
                System.out.println(GuessNumberTest.player1.getName() + ", Вы угадали!");
                break;
            }

            System.out.println(GuessNumberTest.player2.getName() + ", введите ваше число от 0 до 100:");
            GuessNumberTest.player2.setNumber(sc.nextInt());
            int player2Num = GuessNumberTest.player2.getNumber();

            if (player2Num < compNum) {
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
            } else if (player2Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player2Num == compNum) {
                System.out.println(GuessNumberTest.player1.getName() + ", Вы угадали!");
                break;
            }
        }
    }
}
