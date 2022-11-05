package com.pragra.day9;

import java.util.Arrays;
import java.util.Random;

public class Array2DDemo1 {
    public static void main(String[] args) {
        int[][] marks = new int[3][5];
        Random random = new Random();


        for (int j = 0; j < marks[0].length; j++) {
            int totalMarksInOneSubject = 0;
            for (int i = 0; i < marks.length; i++) {
                marks[i][j] = random.nextInt(100);
                System.out.println(marks[i][j] + "  ");
                totalMarksInOneSubject += marks[i][j];
            }
            System.out.println("total marks in one subject ::  " + totalMarksInOneSubject);

        }

    }
}

