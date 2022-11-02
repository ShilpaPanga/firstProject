package com.pragra.Day6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number :: ");
        n = sc.nextInt();
        fact(n);
    }

    public static void fact(int n) {
        int fac = 1;
        for (int i = 1; i <= n; ) {
            fac *= i;
            i++;
        }
        System.out.println(fac);
    }

}