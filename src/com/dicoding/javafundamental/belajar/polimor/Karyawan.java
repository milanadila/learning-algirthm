package com.dicoding.javafundamental.belajar.polimor;

public abstract class Karyawan extends Manusia {

    public abstract Integer calculateGaji();

    @Override
    void makan() {
        System.out.println("Karyawan makan");
    }

    @Override
    void tidur() {
        System.out.println("Karyawan tidur");
    }

    @Override
    void bergerak() {
        System.out.println("Karyawan bergerak");
    }
}
