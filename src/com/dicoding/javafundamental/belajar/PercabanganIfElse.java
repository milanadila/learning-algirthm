package com.dicoding.javafundamental.belajar;

import java.util.Scanner;

public class PercabanganIfElse {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nama: ");
        nama = scan.nextLine();
        System.out.println("Nilai: ");
        nilai = scan.nextInt();

        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        }
        else {
            System.out.println("Mohon maaf " + nama + ", anda gagal!");
        }
    }
}
