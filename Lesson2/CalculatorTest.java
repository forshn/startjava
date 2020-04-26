import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        boolean ifNo = true;
        do {
            System.out.println("Введите первое число");
            calc.setFirstNumber(sc.nextInt());

            System.out.println("Введите знак математической операции");
            calc.setSign(sc.next().charAt(0));

            System.out.println("Введите второе число");
            calc.setSecondNumber(sc.nextInt());

            System.out.println(calc.calculate());

            boolean isAnswer = true;
            do {
                System.out.println("Хотите продолжить, yes/no?");
                String answer = sc.next();

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


