import java.util.*;

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

            String answer;
            do {
                System.out.println("Хотите продолжить, yes/no?");
                answer = sc.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            if (answer.equals("no")) {
                break;
            }
        } while (true);
    }
}


