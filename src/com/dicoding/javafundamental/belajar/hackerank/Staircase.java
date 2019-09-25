package com.dicoding.javafundamental.belajar.hackerank;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        int n = 6;
        StringBuilder stair = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            stair.append(" ");
        }

        for (int i = 1; i < n+1; i++) {
            stair.setCharAt(n-i, '#');
            System.out.println(stair);
        }
    }
}
