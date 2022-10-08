package com.bridgelabz;


import java.util.Scanner;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome Player");
        int position = 0;
        int position2 = 0;
        int dice;
        int option;
        int roll = 0;
        int turn = 0;
        int oldTurn = 0;

        while (position < 100 && position2 < 100) {

            if (turn == 0)
                System.out.println("Player 1 is Playing");
            else
                System.out.println("Player 2 is Playing ");
            dice = (int) Math.floor((Math.random() * 10) % 6 + 1);
            System.out.println("\n The dice rolled to: " + dice);
            option = (int) Math.floor(Math.random() * 3);

            switch (option) {
                case 0:
                    System.out.println("Player action: Nothing");
                    break;
                case 1:
                    System.out.println("Player action: Ladder");
                    if (turn == 0)
                        position += dice;
                    else
                        position2 += dice;

                    if (position > 100) {
                        position -= dice;
                        System.out.println("Player exceeds 100");
                    }

                    if (position2 > 100) {
                        position2 -= dice;
                        System.out.println("Player2 exceeds 100");
                    }
                    break;

                case 2:
                    System.out.println("Player Action: Snake");
                    if (turn != 0)
                        position -= dice;
                    else
                        position2 -= dice;

                    if (position < 0) {
                        position = Math.max(position, 0);
                        System.out.println("Player1 reset to 0");
                    }

                    if (position2 < 0) {
                        position2 = Math.max(position2, 0);
                        System.out.println("Player2 reset to 0");
                    }

                    turn = (turn + 1) % 2;
                    break;
            }
            if (oldTurn == 0)
                System.out.println("Current position for Player1: " + position + "\n");
            else
                System.out.println("Current position for Player2: " + position2 + "\n");
            roll++;
            oldTurn = turn;

        }
        System.out.println("Congratulations Player " + (turn + 1) + "!!");
        System.out.println("We took " + roll + " rolls to win the game!!");
    }
}



