package com.dicoding.javafundamental.belajar.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingUsingIterators {
    public static void main(String[] args) {
        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "milan");
        customers.put(2, "adila");
        customers.put(3, "amalia");

        //using iterator
        Iterator<Map.Entry<Integer, String>> iterator = customers.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }
    }
}
