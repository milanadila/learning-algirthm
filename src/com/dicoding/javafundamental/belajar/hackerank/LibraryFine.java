package com.dicoding.javafundamental.belajar.hackerank;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Return day : ");
        int returnDay = scan.nextInt();
        System.out.println("Return month : ");
        int returnMonth = scan.nextInt();
        System.out.println("Return year : ");
        int returnYear = scan.nextInt();

        System.out.println("Expected day : ");
        int expectedDay = scan.nextInt();
        System.out.println("Expected month : ");
        int expectedMonth = scan.nextInt();
        System.out.println("Expected year : ");
        int expectedYear = scan.nextInt();

        int hackosFine = 0;

        //if statement that checks starting at the years and proceeds based on equivalence
        //Year is off  - 10,000 hackos
        //Month is off - months * 500 hackos
        //Day is off   - days * 15 hackos

        if (expectedYear < returnYear) {
            hackosFine = 10000;
        } else if (expectedYear == returnYear) {
            if (expectedMonth < returnMonth) {
                hackosFine = (returnMonth - expectedMonth) * 500;
            } else if (expectedMonth == returnMonth) {
                if (expectedDay < returnDay) {
                    hackosFine = (returnDay - expectedDay) * 15;
                }
            }
        }
        System.out.println("\nFine : " + hackosFine);
    }
}
