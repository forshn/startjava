package com.startjava.lesson4.gamemodified;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int maxSizeOfNumber = 100;
    private int compNum;
    private Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private boolean isAnswerYes = true;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("У вас 10 попыток");
        compNum = setCompNumber();

        while (isAnswerYes) {
            if (player1.getCounterNumber() < 10 && isAnswerYes) {
                player1.setNumber(enterNumber(player1.getName()));
                compareNumbers(player1, compNum);
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }

            if (player2.getCounterNumber() < 10 && isAnswerYes) {
                player2.setNumber(enterNumber(player2.getName()));
                compareNumbers(player2, compNum);
            } else {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
        }
        showResult(player1.getName(), player1.getEnteredNumbers(), player1.getCounterNumber());
        showResult(player2.getName(), player2.getEnteredNumbers(), player2.getCounterNumber());
        player1.setCounter(0);
        player2.setCounter(0);
        player1.clearEnteredNumbers();
        player2.clearEnteredNumbers();
        isAnswerYes = true;
    }

    private int setCompNumber() {
        return (int) (Math.random() * maxSizeOfNumber + 1);
    }

    private int enterNumber(String name) {
        System.out.println(name + ", введите ваше число от 0 до 100:");
        return sc.nextInt();
    }

    private boolean compareNumbers(Player player, int compNumber) {
        if (player.getNumber() < compNumber) {
            System.out.println("Введенное вами число меньше того, что загадал комьютер");
            return true;
        } else if (player.getNumber() > compNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            return true;
        } else {
            System.out.println(player.getName().toUpperCase() + ", Вы угадали!" + "\n" + "Игрок " + player.getName().toUpperCase() + " угадал число " + compNumber + " с " + player.getCounterNumber() + " Попытки");
            return isAnswerYes = false;
        }
    }

    private void showResult(String name, int[] enteredNumbers, int counterNumber) {
        System.out.println("Числа, которые вводил " + name + " :" + "\n" + Arrays.toString(Arrays.copyOf(enteredNumbers, counterNumber)));
    }
}

