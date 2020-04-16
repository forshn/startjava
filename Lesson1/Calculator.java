public class Calculator {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        char sign = '+';

        if (sign == '+'){
            System.out.println(a + b);
        } else if (sign == '-'){
            System.out.println(a - b);
        } else if (sign == '*'){
            System.out.println(a * b);
        } else if (sign == '/'){
            System.out.println(a / b);
        } else if (sign == '%') {
            System.out.println(a % b);
        } else if (sign == '^'){
            System.out.println (a * a);
        }
    }
}
