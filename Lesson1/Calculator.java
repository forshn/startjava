public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        char sign = '^';

        if (sign == '+') {
            System.out.println(a + b);
        } else if (sign == '-') {
            System.out.println(a - b);
        } else if (sign == '*') {
            System.out.println(a * b);
        } else if (sign == '/') {
            System.out.println(a / b);
        } else if (sign == '%') {
            System.out.println(a % b);
        }
        int exponent = 10;
        int result = 1;
        if (sign == '^')
            for (int i = 0; i < exponent; i++) {
                result *= a;
            }
            System.out.println(result);
    }
}



