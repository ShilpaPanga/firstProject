package com.pragra.day9;

public class MarksArray {
    public static void main(String[] args) {
        int[] marks = {100,95,96,97,98};
        int totalMarks =0;
       for(int i=0;i<=marks.length;i++){
           totalMarks+= marks[i];
       }
        System.out.println(totalMarks);

        System.out.println("make changes");

    }
}
