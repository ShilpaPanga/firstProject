package com.pragra.Day6;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number here  ::  ");
        int x = sc.nextInt();
        testPosNeg(x);
    }

    public static void testPosNeg(int x) {
        if (x > 0) {
            System.out.println(x + "  is positive number");
        } else if (x < 0) {
            System.out.println(x + "  is negative number");
        } else {
            System.out.println(x + "  is neutral number");
        }
    }
}
