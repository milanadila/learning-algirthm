package com.dicoding.javafundamental.belajar;

import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        //membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while (running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [ya/tidak]");
            jawab = scan.nextLine();

            if (jawab.equalsIgnoreCase("ya")) {
                running = false;
            }

            counter++;

        }

        System.out.println("Anda sudah melakukan pengulangan sebanyak " + counter + " kali");
    }
}
