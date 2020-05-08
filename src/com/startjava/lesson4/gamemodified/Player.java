package com.startjava.lesson4.gamemodified;

import java.util.Arrays;

public class Player {

    private String name;
/*
    private int number;
*/
    private int[] enteredNumbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.enteredNumbers[attempt] = number;
        attempt++;
    }

    public int getNumber() {
        return enteredNumbers[attempt-1];
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public void setCounter(int counter) {
        this.attempt = counter;
    }

    public int getCounterNumber() {
        return attempt;
    }

    public void clearEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, attempt, -1);
    }
}
