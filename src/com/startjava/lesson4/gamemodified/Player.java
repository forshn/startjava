package com.startjava.lesson4.gamemodified;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    int[] numbersPlayer1 = new int[10];
    int[] numbersPlayer2 = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int player1Counter = 0;

    public void setNumber1(int number) {
        this.number = number;
        numbersPlayer1[player1Counter] = number;
        player1Counter++;
    }

    public static int player2Counter = 0;

    public void setNumber2(int number) {
        this.number = number;
        numbersPlayer2[player2Counter] = number;
        player2Counter++;
    }

    public int getNumber() {
        return number;
    }

    public void showResult1() {
        System.out.println(Arrays.toString(Arrays.copyOf(numbersPlayer1, player1Counter)));
    }

    public void showResult2() {
        System.out.println(Arrays.toString(Arrays.copyOf(numbersPlayer2, player2Counter)));
    }

    public void toZero() {
        Arrays.fill(numbersPlayer1, 0, player1Counter, 0);
        Arrays.fill(numbersPlayer2, 0, player2Counter,0);
    }
}
