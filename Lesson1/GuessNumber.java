public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int numComp = 34;
        int numMan = 90;


        if (numMan >= 0 && numMan <=100 && numMan < numComp) {
            System.out.println("Введенное вами число меньше того, что загадал комьютер");
        } else if (numMan >= 0 && numMan <=100 && numMan > numComp) {
            System.out.println("Введенное вами число больше того, что загадал комьютер");
        } else if (numMan >= 0 && numMan <=100) {
            System.out.println("Вы угадали!");
        }
    }
}
