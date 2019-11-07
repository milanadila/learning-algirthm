package com.dicoding.javafundamental.belajar.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> milan = new HashMap<>();
        //enter key and value
        milan.put(1, "milan doang");
        milan.put(2, "milan adila");
        milan.put(3, "milan adila amalia");

        //using for each loop for iteration over Map.EntrySet()
        for (Map.Entry<Integer, String> entry: milan.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
