package com.dicoding.javafundamental.belajar.hackerank;

public class BeautifulDay {
    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        int days = 0;
        int ax= 0;

        for (int x = i; x <= j; x++) {
            int reverse = 0;
            ax = x;
            while (ax != 0) {
                int digit = ax % 10;
                reverse = reverse * 10 + digit;
                ax /= 10;
        }
            int day = (Math.abs(reverse - x))%k;
            if (day ==  0) {
                days += 1;
            }

        }

        System.out.println("Beautiful days : " + days);
    }
}
