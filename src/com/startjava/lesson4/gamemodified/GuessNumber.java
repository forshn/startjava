package com.startjava.lesson4.gamemodified;

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
            if (player1.getCounterNumber() < 10 && isTrue) {
                System.out.println(player1.getName() + ", введите ваше число от 0 до 100:");
                enterNumber(sc.nextInt());
                System.out.println(compareNumbers(player1.getNumber(), compNum, player1.getName(), player1.getCounterNumber()));
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }

            if (player2.getCounterNumber() < 10 && isTrue) {
                System.out.println(player2.getName() + ", введите ваше число от 0 до 100:");
                player2.setNumber(sc.nextInt());
                System.out.println(compareNumbers(player2.getNumber(), compNum, player2.getName(), player2.getCounterNumber()));
            } else {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
        }
        player1.showResult();
        player2.showResult();
        player1.setCounter(0);
        player2.setCounter(0);
        player1.clearArray();
        player2.clearArray();
        isTrue = true;
    }
    private int randomizeCompNumber(int max) {
        return (int) (Math.random() * max + 1);
    }

    private int enterNumber(int number){
         return number;
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
