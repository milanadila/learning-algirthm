package com.dicoding.javafundamental.belajar.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        int s1, s2, r ;


        mainMenu();
        switch (pilihan) {
            case '1': {
                System.out.println("Masukan panjang persegi: ");
                s1 = scan.nextInt();
                System.out.println("Masukan lebar persegi: ");
                s2 = scan.nextInt();
                System.out.println("Luas persegi panjang: " + persegiPanjang.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.println("Masukan alas segitiga: ");
                s1 = scan.nextInt();
                System.out.println("Masukan tinggi segitiga: ");
                s2 = scan.nextInt();
                System.out.println("Luas segitiga: " + segitiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + segitiga.keliling(s1,s2));
                break;
            }
            case '3': {
                System.out.println("Masukan jari-jari lingkaran: ");
                r = scan.nextInt();
                System.out.println("Luas lingkaran: " + lingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + lingkaran.keliling(r));
            }
            default: {
                System.out.println("tidak ada pilihan ");
                break;
            }
        }

    }

    private static void mainMenu() {
        System.out.println("====================");
        System.out.println("Hitung luas dan keliling: ");
        System.out.println("1. Persegi panjang ");
        System.out.println("2. Segitiga ");
        System.out.println("3. Lingkaran ");
        System.out.println("Masukan menu : ");
        pilihan = scan.next().charAt(0);
    }
}
