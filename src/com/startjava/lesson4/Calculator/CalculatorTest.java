package com.startjava.lesson4.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;

        do {
            Calculator calc = new Calculator();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите математическое выражение, через пробел: ");
            calc.setMathExpression(sc.nextLine());
            System.out.println(calc.calculate());
            do {
                System.out.println("Хотите продолжить, yes/no?");
                answer = sc.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}

