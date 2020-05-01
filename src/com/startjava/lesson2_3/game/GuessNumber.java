package com.startjava.lesson2_3.game;

import java.util.*;

public class GuessNumber {
    private int compNum = (int) (Math.random() * 101);
    private Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        while (true) {
            System.out.println(player1.getName() + ", введите ваше число от 0 до 100:");
            player1.setNumber(sc.nextInt());
            int player1Num = player1.getNumber();

            if (player1Num < compNum) {
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
            } else if (player1Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player1Num == compNum) {
                System.out.println(player1.getName() + ", Вы угадали!");
                break;
            }

            System.out.println(player2.getName() + ", введите ваше число от 0 до 100:");
            player2.setNumber(sc.nextInt());
            int player2Num = player2.getNumber();

            if (player2Num < compNum) {
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
            } else if (player2Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player2Num == compNum) {
                System.out.println(player2.getName() + ", Вы угадали!");
                break;
            }
        }
    }
}
