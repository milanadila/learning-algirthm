package com.dicoding.javafundamental.belajar.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah kucing IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");
    }
}
