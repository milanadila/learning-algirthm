package com.dicoding.javafundamental.belajar.hackerank;

public class TheHurdleRace {
    public static void main(String[] args) {
        int h = 5;
        int[] height = {1, 6, 3, 5, 2};
        int k = 4;
        int tallestHurdle = 0;
        int dose;

        for (int i = 0; i < h; i++) {
            int valueHurdle = height[i];
            if (valueHurdle > tallestHurdle) {
                tallestHurdle = valueHurdle;
            }
        }

            if (tallestHurdle > k) {
                dose = tallestHurdle - k;
                System.out.println("dose : " + dose);
            }

            if (tallestHurdle < k) {
                dose = 0;
                System.out.println("dose : " + dose);
            }
    }
}
