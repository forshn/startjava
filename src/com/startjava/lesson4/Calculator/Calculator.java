package com.startjava.lesson4.Calculator;

public class Calculator {
    private String[] mathEx = new String[3];

    public void setMathExpression(String mathEx) {
        this.mathEx = mathEx.split(" ", 3);
    }

    public int calculate() {
        int firstNumber = Integer.parseInt(mathEx[0]);
        String sign = mathEx[1];
        int secondNumber = Integer.parseInt(mathEx[2]);

        switch (sign) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            case "%":
                return firstNumber % secondNumber;
            case "^":
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("Неверно указан тип операции");
        }
        return 0;
    }
}