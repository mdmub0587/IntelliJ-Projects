package com.gradle.demo;

public class Factorial {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(i+"!="+ factorial(i));
        }
    }
    public static long factorial(int number){
        long factorial_of_number = 1;
        for(int num=1; num<=number; num++)
            factorial_of_number *= num;

        return factorial_of_number;
    }
}
