package com.pragra.Day6;

import java.util.Scanner;

public class DaysOfMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month here:  ");
        int month = sc.nextInt();

      testDaysOfMonths(month);
    }

    public static void testDaysOfMonths(int month){
        if(month == 1){
            System.out.println("31 days");
        }
        else if(month ==2){
            System.out.println("28 days");
        }
        else if(month ==3){
            System.out.println("31 days");
        }
        else if(month ==4){
            System.out.println("30 days");
        }
        else if(month ==5){
            System.out.println("31 days");
        }
        else if(month ==6){
            System.out.println("30 days");
        }
        else if(month ==7){
            System.out.println("31 days");
        }
        else if(month ==8){
            System.out.println("30 days");
        }
        else{
            System.out.println("wrong input");
        }

    }
}
