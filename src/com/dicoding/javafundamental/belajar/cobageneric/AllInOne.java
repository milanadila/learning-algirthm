package com.dicoding.javafundamental.belajar.cobageneric;

public class AllInOne<T> {
    //T kepanjangan dari tipe parameter
    private T Manusia;

    //method void set dengan tipe parameter T
    public void setManusia(T Manusia) {
        this.Manusia= Manusia;
    }

    //method return get yang mengembalikan nilai Manusia
    public T getManusia() {
        return Manusia;
    }
}
