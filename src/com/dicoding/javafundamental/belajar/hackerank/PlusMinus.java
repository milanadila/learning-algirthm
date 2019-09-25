package com.dicoding.javafundamental.belajar.hackerank;

public class PlusMinus {
    public static void main(String[] args) {
        int n = 6;
        int[] x = {-4, 3, -9, 0, 4, 1};
        double nilaia = 0;
        double nilaib = 0;
        double nilaic = 0;

        for (int i = 0; i < n; i++) {
            int value = x[i];
            if (value > 0) {
                nilaia += 1;
            } if (value < 0) {
                nilaib += 1;
            } if (value == 0) {
                nilaic += 1;
            }
        }

        System.out.println(nilaia/n + "\n" + nilaib/n + "\n" + nilaic/n);
    }
}
