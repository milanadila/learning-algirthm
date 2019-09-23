package com.dicoding.javafundamental.belajar.vocalkonsonan;

import java.util.Scanner;

public class Konsonan {
    public static void main(String[] args) {

        String word = " ";
        int vokal = 0;
        int konsonan = 0;

        System.out.println("Masukan kalimat: ");
        Scanner scan = new Scanner(System.in);
        word = scan.nextLine();

        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal: " + vokal);
        System.out.println("JUlah huruf konsonan: " + konsonan);

    }

    private static int num_vokal(String word) {
        int i;
        int jumlah_vokal=0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlah_vokal++;
            }
        }

        return jumlah_vokal;
    }

    private static int num_konsonan(String word) {
        int i;
        int jumlah_konsonan=0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) !='a' && word.charAt(i) !='i' && word.charAt(i) !='u' && word.charAt(i) !='e' && word.charAt(i) !='o') {
                jumlah_konsonan++;
            }
        }

        return jumlah_konsonan;
    }
}
