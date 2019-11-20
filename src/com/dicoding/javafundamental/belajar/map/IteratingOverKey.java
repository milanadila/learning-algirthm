package com.dicoding.javafundamental.belajar.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverKey {
    public static void main(String[] args) {
        Map<Integer, String> milan = new HashMap<>();
        //enter key and value
        milan.put(1, "milan doang");
        milan.put(2, "milan adila");
        milan.put(3, "milan adila amalia");

        //using keySet() for iteration over keys
        for (Integer key : milan.keySet())
            System.out.println("key : " + key);

        //using values() for iteration over values
        for (String name : milan.values())
            System.out.println("values : " + name);

    }
}
