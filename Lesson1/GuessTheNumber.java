public class GuessTheNumber {
    public static void main(String[] args){
        System.out.println("Введите число");
        int num = 101;
        if (num >= 0 && num <=100){
            System.out.println("Вы угадали!");
        } else {
            System.out.println("Введенное вами число больше (меньше) того, что загадал комьютер");
        }
    }
}
