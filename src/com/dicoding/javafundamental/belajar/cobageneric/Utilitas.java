package com.dicoding.javafundamental.belajar.cobageneric;

public class Utilitas {
    public <T> T ambilTengah(T[] data) {
        return data[data.length / 2];
    }
}
