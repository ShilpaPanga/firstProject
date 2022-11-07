package com.pragra.day4;

public class Calculator {
    public static void main(String[] args) {
        int sum = add(5 , 7);
        System.out.println("sum : "+sum);

        int difference = difference(50 , 39);
        System.out.println("difference : "+difference);

        int multiplication = multiply(35 , 23);
        System.out.println("multiplication: "+multiplication);

        double division = divide(49, 22);
        System.out.println("division: "+division);

        System.out.println("jenkins created");

    }

    public static int add(int a , int b){
        return a + b;
    }

    public static int difference(int x , int y){
        return x - y;
    }

    public static int multiply(int c , int d){
        return c * d;
    }

    public static int divide(int e , int f){
        return  (e / f);
    }

}
