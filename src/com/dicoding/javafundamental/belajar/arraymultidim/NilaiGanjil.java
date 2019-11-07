package com.dicoding.javafundamental.belajar.arraymultidim;

public class NilaiGanjil {
    public static void main(String[] args) {
        int jumlah = 0;
        int[] arraynya = {8, 5, 7, 3, 10, 174, 15, 3, 18, 10, 230};
        String angka = "";
        for (int i = 0; i < arraynya.length; i++) {
            if (arraynya[i]%2 != 0) {
                jumlah += 1;
                angka += arraynya[i] + " ";
            }
        }
        System.out.println();
        System.out.println("Angka : " + angka);
        System.out.println("Jumlah : " + jumlah);
    }
}
