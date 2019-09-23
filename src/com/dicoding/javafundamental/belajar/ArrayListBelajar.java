package com.dicoding.javafundamental.belajar;

import java.util.ArrayList;

public class ArrayListBelajar {
    public static void main(String[] args) {
        ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Senter pembesar");
        kantongAjaib.add(34352);
        kantongAjaib.add("Pengubah makanan");
        kantongAjaib.add(637272357347.5266324);
        kantongAjaib.add(true);

        kantongAjaib.remove("Pengubah makanan");
        System.out.println(kantongAjaib);
        System.out.println("kantong ajaib berisi " + kantongAjaib.size() + " item");
        System.out.println(kantongAjaib.get(0));
    }
}
