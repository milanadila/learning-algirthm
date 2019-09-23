package com.dicoding.javafundamental.belajar;

import java.util.Scanner;

public class ScannerContoh {

    public static void main(String[] args) {
        //deklarasi variabel
	    String nama;
	    int usia, gaji;

	    //membuat scanner
        java.util.Scanner scan = new java.util.Scanner(System.in);

        //tampilkan output
        System.out.println("Nama: ");
        //menggunakan scanner dan menyimpan apa yg diinput ke dalam variabel nama
        nama = scan.nextLine();

        System.out.println("Usia: ");
        usia = scan.nextInt();

        System.out.println("Gaji: ");
        gaji = scan.nextInt();

        //menampilkan yg sudah disimpan di variabel
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji: " + gaji);

    }
}
