import java.util.*;

public class Calculator {
    private char sign = '*';
    private int firstNumber;
    private int secondNumber;
    private int result;
    Scanner sc = new Scanner(System.in);

    public int calculate() {
        switch (sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                int a = 1;
                for (int i = 0; i < secondNumber; i++) {
                    a *= firstNumber;
                }
                result = a;
                break;
            default:
                System.out.println("Неверно указан тип операции");
                break;
        }
        return result;
    }

    public void start() {
        while (true) {
            System.out.println("Введите первое число");
            firstNumber = sc.nextInt();

            System.out.println("Введите знак математической операции");
            sign = sc.next().charAt(0);

            System.out.println("Введите второе число");
            secondNumber = sc.nextInt();

            System.out.println(calculate());
            break;
        }

        do {
            System.out.println("Хотите продолжить, yes/no?");
            String answer = sc.next();
            if (answer.equals("no")) {
                break;
            } else if (answer.equals("yes")) {
                start();
            }
        } while (true);
    }
}



