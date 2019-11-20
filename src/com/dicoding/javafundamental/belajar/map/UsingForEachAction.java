package com.dicoding.javafundamental.belajar.map;

import java.util.HashMap;
import java.util.Map;

public class UsingForEachAction {
    public static void main(String[] args) {
        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "milan");
        customers.put(2, "adila");
        customers.put(3, "amalia");

        // for each(action) method to iterate map
        customers.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
