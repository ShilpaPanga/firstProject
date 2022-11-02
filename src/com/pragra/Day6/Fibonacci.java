package com.pragra.Day6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ::  ");
        x = sc.nextInt();
        fibo(x);
    }

    public static void fibo(int x){
        int n1=0,n2=1,sum=0;
        System.out.println(n1+"  "+n2);
        for (int i =0; i<=x ; i++){
            sum = n1 + n2;
            System.out.println("  "+sum);
            n1 = n2;
            n2 = sum;
        }

    }
}
