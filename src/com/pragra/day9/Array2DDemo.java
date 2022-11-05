package com.pragra.day9;

import java.util.Arrays;
import java.util.Random;

public class Array2DDemo {
    public static void main(String[] args) {
        int[][] marks = new int[3][5];
        Random random = new Random();
        for (int i = 0; i< marks.length; i++) {
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = random.nextInt(100);
                totalMarks+= marks[i][j];
                System.out.print(marks[i][j]+"  ");
            }
            System.out.println();
            System.out.println(Arrays.toString(marks[i]));
            System.out.println("total marks:: "+totalMarks);
        }


    }
}
