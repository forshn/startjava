import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        calc.start();

        do {
            System.out.println("Хотите продолжить, yes/no?");
            String answer = scan.next();
            if (answer.equals("no")) {
                break;
            } else if (answer.equals("yes")) {
                calc.start();
            }
        } while (true);
    }
}
