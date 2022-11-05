package com.pragra.day9;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int arr [] =  new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<=4;i++){
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }
    }
}
