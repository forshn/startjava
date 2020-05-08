package com.startjava.lesson4.gamemodified;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCounter(int counter) {
        this.attempt = counter;
    }

    public int getCounterNumber() {
        return attempt;
    }

    public void setNumber(int number) {
        this.number = number;
        enteredNumbers[attempt] = number;
        attempt++;
    }

    public int getNumber() {
        return number;
    }

    public void showResult() {
        System.out.println("Числа, которые вводил " + name + " :" + "\n" + Arrays.toString(Arrays.copyOf(enteredNumbers, attempt)));
    }

    public void clearArray() {
        Arrays.fill(enteredNumbers, 0, attempt, -1);
    }
}
