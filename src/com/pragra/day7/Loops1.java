package com.pragra.day7;

public class Loops1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {

                    System.out.print("*  ");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


