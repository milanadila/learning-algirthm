package com.dicoding.javafundamental.belajar.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverKeySearchValue {
    public static void main(String[] args) {
        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "milan");
        customers.put(2, "adila");
        customers.put(3, "amalia");

        //looping over keys
        for (Integer key : customers.keySet()) {
            //searching for values
            String name = customers.get(key);
            System.out.println("key : " + key + ", values : " + name);
        }
    }
}
