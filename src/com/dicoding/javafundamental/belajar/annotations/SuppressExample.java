package com.dicoding.javafundamental.belajar.annotations;

import java.util.ArrayList;

public class SuppressExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("milan");
        list.add("adila");
        list.add("amalia");

        for (Object obj : list)
            System.out.println(obj);
    }
}

/**
 * if you remove the @SuppressWarnings("unchecked")annotations,
 *  it will show warning  compile time because we are using non-generic collection
 */
