package com.dicoding.javafundamental.belajar;

public class Immutable {
    public static void main(String[] args) {

        Immutable imut = new Immutable();
        System.out.println(imut);

//        imut.contohMethod();

        String s = "milan";
        System.out.println(s);

        StringBuilder k = new StringBuilder("milan");
        System.out.println(k);
        k.append("adila");

        s = s + "adila";
        System.out.println(s);

        String beda = "milan";
        System.out.println(beda);

        StringBuilder bebas = new StringBuilder("milan");
        System.out.println(bebas);
        bebas.append("adila");

    }

    public Immutable() {
        System.out.println("abcd ...");
    }

    public void contohMethod() {
        System.out.println("aaaa...");
    }
}
