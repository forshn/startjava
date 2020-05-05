package com.startjava.lesson4.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Введите математическое выражение: ");
            calc.setMathExpression(sc.nextLine());
            System.out.println(calc.calculate());
            calc.calculate();
            do {
                System.out.println("Хотите продолжить, yes/no?");
                answer = sc.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}

