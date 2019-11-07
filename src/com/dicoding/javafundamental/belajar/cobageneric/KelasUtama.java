package com.dicoding.javafundamental.belajar.cobageneric;

public class KelasUtama {
    public static void main(String[] args) {
        AllInOne<String> nama = new AllInOne<>();
        nama.setManusia("Karin");
        System.out.println("Nama saya : " + nama.getManusia());

        AllInOne<Integer> umur = new AllInOne<>();
        umur.setManusia(19);
        System.out.println("Usia saya : " + umur.getManusia());

        AllInOne<Boolean> kondisi = new AllInOne<>();
        kondisi.setManusia(true);
        System.out.println("Saya sedang belajar Java : " + kondisi.getManusia());

        AllInOne<Float> ipk = new AllInOne<>();
        ipk.setManusia(3.5f);
        System.out.println("NIlai IPK saya : " + ipk.getManusia());

        AllInOne<Character> karakter = new AllInOne<>();
        karakter.setManusia('K');
        System.out.println("Huruf awalan nama saya adalah : " + karakter.getManusia());
    }
}
