package com.dicoding.javafundamental.belajar.setget;

public class Main {
    public static void main(String[] args) {
        SetterGetterContoh milan = new SetterGetterContoh();

        //menggunakan method setter
        milan.setUsername("milanadila");
        milan.setPassword("milan123");

        //menggunakan method getter
        System.out.println("Username: " + milan.getUsername());
        System.out.println("Password: " + milan.getPassword());
    }
}
