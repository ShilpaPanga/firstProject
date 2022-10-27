package com.pragra.Day6;

public class Loops {
    public static void main(String[] args) {
       forLoop();
    }

    public static void forLoop() {
        for (int i = 0; i < 15; i++) {
            if(i%3==0)
            System.out.println(i);
        }
    }
}
