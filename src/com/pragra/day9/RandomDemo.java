package com.pragra.day9;

import java.util.Arrays;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int[] marks = new int[5];

        for (int i=0;i<marks.length;i++){
            marks[i] = r.nextInt(100);
           // System.out.println(marks[i]);
        }
        System.out.println(Arrays.toString(marks));

    }
}
