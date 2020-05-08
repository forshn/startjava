package com.startjava.lesson4.gamemodified;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int maxSizeOfNumber = 100;
    private Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private boolean isTrue = true;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int compNum = randomizeCompNumber(maxSizeOfNumber);
        System.out.println("У вас 10 попыток");

        while (isTrue) {
            System.out.println(compNum);
            if (player1.getCounterNumber() < 10 && isTrue) {
                player1.setNumber(enterNumber(player1.getName()));
                System.out.println(compareNumbers(player1.getNumber(), compNum, player1.getName(), player1.getCounterNumber()));
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }

            if (player2.getCounterNumber() < 10 && isTrue) {
                player2.setNumber(enterNumber(player2.getName()));
                System.out.println(compareNumbers(player2.getNumber(), compNum, player2.getName(), player2.getCounterNumber()));
            } else {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
        }
        showResult(player1.getName(), player1.getEnteredNumbers(), player1.getCounterNumber());
        showResult(player2.getName(), player2.getEnteredNumbers(), player2.getCounterNumber());
        player1.setCounter(0);
        player2.setCounter(0);
        player1.clearArray();
        player2.clearArray();
        isTrue = true;
    }

    private int randomizeCompNumber(int maxSizeOfNumber) {
        return (int) (Math.random() * maxSizeOfNumber + 1);
    }

    private int enterNumber(String name) {
        System.out.println(name + ", введите ваше число от 0 до 100:");
        return sc.nextInt();
    }

    private void showResult(String name, int[] enteredNumbers, int counterNumber) {
        System.out.println("Числа, которые вводил " + name + " :" + "\n" + Arrays.toString(Arrays.copyOf(enteredNumbers, counterNumber)));
    }

    private String compareNumbers(int playerNumber, int compNumber, String name, int counter) {
        if (playerNumber < compNumber) {
            return "Введенное вами число меньше того, что загадал комьютер";
        } else if (playerNumber > compNumber) {
            return "Введенное вами число больше того, что загадал компьютер";
        } else {
            isTrue = false;
            return name.toUpperCase() + ", Вы угадали!" + "\n" + "Игрок " + name.toUpperCase() + " угадал число " + compNumber + " с " + counter + " Попытки";
        }
    }
}
