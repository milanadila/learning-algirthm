package com.dicoding.javafundamental.belajar.inheritance;

public class Kucing extends Hewan {
    public Kucing() {
        super();
        System.out.println("construct Kucing");
    }

    public void makan() { //Overriding
        System.out.println("Kucing sedang makan..");
    }

    public void makan(String food) { //Overloading
        System.out.println("Kucing sedang makan " + food);
    }
}
