public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
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
        } else if (sign == '^'){
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            System.out.println(result);
        }
    }
}



