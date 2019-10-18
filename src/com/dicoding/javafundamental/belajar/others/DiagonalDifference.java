package com.dicoding.javafundamental.belajar.others;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("n : ");
        int n = scan.nextInt();

        System.out.println("left diagonal : ");
        int leftDiagonal = scan.nextInt();
        int rightDiagonal = 0;

        for (int i = 1; i < n*n; i++) {
            System.out.println("value : ");
            int value = scan.nextInt();
            if (i % (n+1) == 0) {
                leftDiagonal += value;
            }

            if (i % (n-1) == 0 && i != (n*n)-1) {
                rightDiagonal += value;
            }
        }

        System.out.println("output : " + Math.abs(leftDiagonal - rightDiagonal));
    }
}
