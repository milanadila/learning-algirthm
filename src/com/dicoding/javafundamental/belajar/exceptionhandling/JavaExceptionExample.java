package com.dicoding.javafundamental.belajar.exceptionhandling;

public class JavaExceptionExample {
    public static void main(String[] args) {
        try{
            //code they may raise exception
            int data = 100/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code..");
    }
}
