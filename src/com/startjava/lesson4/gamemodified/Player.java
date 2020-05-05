package com.startjava.lesson4.gamemodified;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] numbersPlayer = new int[10];
    private int playerCounter = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCounter(int counter) {
        this.playerCounter = counter;
    }

    public int getCounterNumber() {
        return playerCounter;
    }

    public void setNumber(int number) {
        this.number = number;
        numbersPlayer[playerCounter] = number;
        playerCounter++;
    }

    public int getNumber() {
        return number;
    }

    public void showResult() {
        System.out.println("Числа, которые вводил " + name + " :" + "\n" + Arrays.toString(Arrays.copyOf(numbersPlayer, playerCounter)));
    }

    public void toZero() {
        Arrays.fill(numbersPlayer, 0, playerCounter, 0);
    }
}
