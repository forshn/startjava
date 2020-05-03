package com.startjava.lesson4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        int maxLength = scanner.nextInt();
        int[] array = new int[maxLength];


        System.out.print("Заполните массив целыми числами через пробел" + " ");
        for (int i = 0; i < maxLength; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < maxLength - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }

        System.out.println("Максимальное число = " + max);
    }
}
