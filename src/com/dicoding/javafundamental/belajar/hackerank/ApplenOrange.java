package com.dicoding.javafundamental.belajar.hackerank;

public class ApplenOrange {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int buahApple = 5;
        int buahJeruk = 15;
        int m = 3;
        int n= 2;
        int[] mApple = {-2, 2, 1};
        int[] nJeruk = {5, -6};
        int jumlahAppleSam = 0;
        int jumlahJerukSam = 0;

        for (int i = 0; i < m; i++) {
            int valueApple = mApple[i];
            int fallPositionApple = buahApple + valueApple;
            if (fallPositionApple >= s &&  fallPositionApple <= t) {
                jumlahAppleSam += 1;
            }
        }

        for (int y = 0; y < n; y++) {
            int valueJeruk = nJeruk[y];
            int fallPositionJeruk = buahJeruk + valueJeruk;
            if (fallPositionJeruk >= s && fallPositionJeruk <= t) {
                jumlahJerukSam += 1;
            }
        }

        System.out.println("Jumlah apel Sam : " + jumlahAppleSam);
        System.out.println("Jumlah jeruk Sam : " + jumlahJerukSam);
    }
}
