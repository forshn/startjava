public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int compNum = 34;
        int playerNum = 32;

        if (playerNum >=0 && playerNum <= 100){
        for (int i = 0; i < 101; i ++) {
            playerNum += i;
            if (playerNum < compNum) {
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
                break;
            } else if (playerNum > compNum) {
                System.out.println("Введенное вами число больше того, что загадал комьютер");
                break;
            } else System.out.println("Вы угадали!");
                break;
            }
        }

    }
}
