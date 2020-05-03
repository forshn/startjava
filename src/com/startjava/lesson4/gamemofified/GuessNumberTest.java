package com.startjava.lesson4.gamemofified;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scan.next());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {

            System.out.println("У вас 10 попыток");
            game.startGame();
            do {
                System.out.println("Хотите продолжить, yes/no?");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
