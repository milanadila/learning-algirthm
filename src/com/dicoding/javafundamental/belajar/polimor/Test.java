package com.dicoding.javafundamental.belajar.polimor;

public class Test {
    public static void main(String[] args) {

        Manusia[] manusia = new Manusia[2];

        manusia[0] = new Siswa();
        manusia[1] = new Programmer();

        for (int i = 0; i < manusia.length; i++) {
            manusia[i].makan();
            manusia[i].tidur();
            manusia[i].bergerak();
            System.out.println();
        }
    }
}
