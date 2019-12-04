package com.dicoding.javafundamental.belajar.javacollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        // Set demonstration using HashSet
        Set <String> hash_set = new HashSet<>();

        hash_set.add("Geeks");
        hash_set.add("For");
        hash_set.add("Geeks");
        hash_set.add("Example");
        hash_set.add("Set");
        System.out.print("Set output without the duplicates");

        System.out.println(hash_set);

        // Set demonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set <String> tree_set = new TreeSet<String>(hash_set);
        System.out.println(tree_set);
    }
}
