package com.pragra.Day6;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here : ");
        int x = sc.nextInt();
       testEvenOdd(x);

    }

    public static void testEvenOdd(int x){
        if( x%2==0){
            System.out.println("This is even number");
        }
        else {
            System.out.println("This is odd number");
        }

        System.out.println("End");
    }
}
