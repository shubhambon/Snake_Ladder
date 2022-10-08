package com.bridgelabz;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Welcome to snake ladder program.");
        int userPosition = 0;
        System.out.println("----Game Starts----");
        System.out.println("Initial position of user: "+userPosition);

        int dice = r.nextInt(6) + 1 ;
        System.out.println("Dice Rolled: "+dice);
    }

}

