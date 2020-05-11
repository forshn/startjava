package com.startjava.lesson4.gamemodified;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int maxSizeOfNumber = 100;
    private int compNum;
    private Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("У вас 10 попыток");
        compNum = generateRandomNumber();

        do {
            if (player1.getAttemptsNumber() < 10) {
                enterNumber(player1);
                compareNumbers(player1, compNum);
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }

            if (player1.getNumber() != compNum) {
                if (player2.getAttemptsNumber() < 10) {
                    enterNumber(player2);
                    compareNumbers(player2, compNum);
                } else {
                    System.out.println("У " + player2.getName() + " закончились попытки");
                    break;
                }
            }
        } while (player2.getNumber() != compNum & player1.getNumber() != compNum);

        showResult(player1);
        showResult(player2);
        player1.addAttempt(0);
        player2.addAttempt(0);
        player1.clearEnteredNumbers();
        player2.clearEnteredNumbers();
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * maxSizeOfNumber + 1);
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + ", введите ваше число от 0 до 100:");
        player.setNumber(sc.nextInt());
    }

    private boolean compareNumbers(Player player, int compNumber) {
        if (player.getNumber() < compNumber) {
            System.out.println("Введенное вами число меньше того, что загадал комьютер");
            return true;
        } else if (player.getNumber() > compNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            return true;
        } else {
            System.out.println(player.getName().toUpperCase() + ", Вы угадали!" + "\n" + "Игрок " + player.getName().toUpperCase() + " угадал число " + compNumber + " с " + player.getAttemptsNumber() + " Попытки");
            return false;
        }
    }

    private void showResult(Player player) {
        System.out.println("Числа, которые вводил " + player.getName() + " :" + "\n" + Arrays.toString(Arrays.copyOf(player.getEnteredNumbers(), player.getAttemptsNumber())));
    }
}

