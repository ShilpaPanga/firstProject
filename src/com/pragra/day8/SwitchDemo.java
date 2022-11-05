package com.pragra.day8;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int thoughtNumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("i have thought a number....try guessing it");
        int guessedNumber = sc.nextInt();

        while (guessedNumber != thoughtNumber) {
            System.out.println("You lose...try again");
            guessedNumber = sc.nextInt();

        }


        System.out.println("you win");
        // System.out.println("new feature");
        //System.out.println("second feature");
        //System.out.println("third feature");
    }
}
