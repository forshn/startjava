import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите первое число");
            calc.setFirstNumber(sc.nextInt());

            System.out.println("Введите знак математической операции");
            calc.setSign(sc.next().charAt(0));

            System.out.println("Введите второе число");
            calc.setSecondNumber(sc.nextInt());

            System.out.println(calc.calculate());
            System.out.println("Хотите продолжить, yes/no?");

            String answer = sc.next();
            if (!answer.equals("yes")) {
                break;
            }
        }
        while (true);
    }
}
