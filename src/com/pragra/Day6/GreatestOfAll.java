package com.pragra.Day6;

public class GreatestOfAll {
    public static void main(String[] args) {
     testGreatestOfAll(2,9,8);

    }

    public static void testGreatestOfAll(int a,int b,int c){
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=c && b>=a){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }


}
