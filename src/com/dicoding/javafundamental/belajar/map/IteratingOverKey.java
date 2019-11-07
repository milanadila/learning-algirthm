package com.dicoding.javafundamental.belajar.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverKey {
    public static void main(String[] args) {
        Map<String, String> milan = new HashMap<>();
        //enter key and value
        milan.put("satu", "milan doang");
        milan.put("dua", "milan adila");
        milan.put("tiga", "milan adila amalia");

        //using keySet() for iteration over keys
        for (String key : milan.keySet())
            System.out.println("key : " + key);

        //using values() for iteration over values
        for (String name : milan.values())
            System.out.println("values : " + name);

    }
}
