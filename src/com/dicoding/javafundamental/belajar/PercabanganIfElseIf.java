package com.dicoding.javafundamental.belajar;

import java.util.Scanner;

public class PercabanganIfElseIf {
    public static void main(String[] args) {
        int nilai;
        String grade;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inputkan nilai: ");
        nilai = scan.nextInt();

        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C";
        } else if (nilai >= 60) {
            grade = "D";
        }
        else {
            grade = "D";
        }

        System.out.println("Grade: " + grade);
    }
}
