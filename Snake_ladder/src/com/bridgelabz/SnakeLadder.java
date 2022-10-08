package com.bridgelabz;

import java.util.Scanner;

public class SnakeLadder {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int position = 0;
        int dice;
        int option;
        System.out.println("Welcome Player");

        while (position <= 100) {
            System.out.println("Enter 1 to roll a die");
            int die = in.nextInt();
            dice = (int)Math.floor((Math.random() * 10) % 6 + 1);
            System.out.println("\n The dice rolled to: " + dice);
            option = (int)Math.floor(Math.random() * 3);

            switch (option) {
                case 0 -> System.out.println("Player action: Nothing");
                case 1 -> {
                    System.out.println("Player action: Ladder");
                    position += dice;
                }
                case 2 -> {
                    System.out.println("Player Action: Snake");
                    position -= dice;
                    position = Math.max(position, 0);
                }
            }

            System.out.println("Current position:" + position);
        }
        System.out.println("Congratulations You Won");
    }
}


