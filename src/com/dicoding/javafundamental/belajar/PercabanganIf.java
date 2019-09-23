package com.dicoding.javafundamental.belajar;

import java.util.Scanner;

public class PercabanganIf {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Total belanja: Rp. ");
        belanja = scan.nextInt();

        if (belanja > 50000) {
            System.out.println("Selamat, anda dapat piring cantik!");
        }

        System.out.println("Terima kasih telah berbelanja");
    }
}
