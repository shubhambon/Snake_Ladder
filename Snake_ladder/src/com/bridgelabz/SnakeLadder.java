package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {

        int position = 0;
        System.out.println(" Player Checks for a option");

        int randomv = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(" Number Got: " + randomv);

        int option = (int) Math.floor(Math.random() * 10) % 3;

        if (option == 0) {
            System.out.println(" Player Action : No Play");
        } else if (option == 1) {
            System.out.println(" Player Action : Ladder");
            position += randomv;
        } else if (option == 2) {
            System.out.println(" Player Action : Snake");
            position -= randomv;
        }

        System.out.println("Current Position" + position);
    }
}
