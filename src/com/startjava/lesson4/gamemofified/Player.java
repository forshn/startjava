package com.startjava.lesson4.gamemofified;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    int[] numbers = new int[10];
    int[] numbers2 = new int[10];

    public void showResult() {
        System.out.println(Arrays.toString(Arrays.copyOf(numbers, i)));
    }

    public void showResult2() {
        System.out.println(Arrays.toString(Arrays.copyOf(numbers2, j)));
    }

    public void toZero() {
        Arrays.fill(numbers, 0);
        Arrays.fill(numbers2, 0);
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

    public static int j = 0;

    public void setNumber1(int number) {

        this.number = number;
        numbers2[j] = number;
        j++;
    }


    public int getNumber() {
        return number;
    }
}
