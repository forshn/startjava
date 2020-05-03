package com.startjava.lesson4.gamemofified;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    int[] numbers = new int[10];


    public void showResult() {
        System.out.println(Arrays.toString(Arrays.copyOf(numbers, i)));
    }

    public void toZero(){
        Arrays.fill(numbers, 0);
    }


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int i = 0;

    public void setNumber(int number) {

        this.number = number;
        numbers[i] = number;
        i++;
    }


    public int getNumber() {
        return number;
    }
}
