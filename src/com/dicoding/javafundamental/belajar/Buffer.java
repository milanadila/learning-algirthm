package com.dicoding.javafundamental.belajar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) throws IOException {
       String nama;

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.println("Input nama: ");
        nama = br.readLine();

        System.out.println("Namaku adalah " + nama);

    }
}
