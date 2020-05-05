package com.startjava.lesson4.Calculator;

public class Calculator {
    private String[] mathEx = new String[3];

    public void setMathExpression(String mathEx) {
        this.mathEx = mathEx.split(" ", 3);
    }

    int result;

    public int calculate() {
        String sign = mathEx[1];
        int firstNumber = Integer.parseInt(mathEx[0]);
        int secondNumber = Integer.parseInt(mathEx[2]);

        switch (sign) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            case "^":
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Неверно указан тип операции");
                break;
        }
        return result;
    }
}