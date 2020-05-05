package com.startjava.lesson4.Calculator;

public class Calculator {
    private char sign = '*';
    private int firstNumber;
    private int secondNumber;
    private String mathExpr;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }



    public void setMathExpression (String mathExpr){
        this.mathExpr = mathExpr;
        System.out.println(mathExpr);
    }
    private int result;

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
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Неверно указан тип операции");
                break;
        }
        return result;
    }
}
