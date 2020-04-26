import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        firstLoop:
        do {
            System.out.println("Введите первое число");
            calc.setFirstNumber(sc.nextInt());

            System.out.println("Введите знак математической операции");
            calc.setSign(sc.next().charAt(0));

            System.out.println("Введите второе число");
            calc.setSecondNumber(sc.nextInt());

            System.out.println(calc.getResult());
            System.out.println("Хотите продолжить, yes/no?");

            String answer = sc.next();

            if (answer.equals("no")) {
                break;
            } else if (answer.equals("yes")) {
            } else if (!answer.equals("yes") || !answer.equals("no")) {
                do {
                    System.out.println("Хотите продолжить, yes/no?");
                    answer = sc.next();
                    if (answer.equals("no")) {
                        break firstLoop;
                    }
                    if (answer.equals("yes")) {
                        break;
                    }
                } while (true);
            }

        }
        while (true);
    }
}
