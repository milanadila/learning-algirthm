package com.dicoding.javafundamental.belajar.hackerank;

import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n : ");
        int n = scan.nextInt();
        int[] types = new int[n];

        for (int types_i = 0; types_i < n; types_i ++) {
            System.out.println("type : ");
            int type = scan.nextInt() -1;
            types[type] = types[type] +1;
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (types[i] > max) {
                max = types[i];
                index = i;
            }
        }
        System.out.println("\noutput : " + (index+1));
    }
}
