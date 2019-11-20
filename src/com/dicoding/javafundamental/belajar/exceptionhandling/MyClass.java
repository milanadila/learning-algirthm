package com.dicoding.javafundamental.belajar.exceptionhandling;

public class MyClass {
    public static void main(String[] args) {
        try {
            int[] number = {1, 2, 3};
            System.out.println(number[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        } finally {
            System.out.println("\nThe 'try catch' is finished.");
        }
    }
}
