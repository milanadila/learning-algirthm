package com.dicoding.javafundamental.belajar.solid.liskov;

public interface Toy {
    void battery();
    void makeNoise();
}

class DuckToy implements Toy{
    public void battery() {
        System.out.println("AAAAA");
    }

    public void makeNoise() {
        System.out.println("Kwek kwek");
    }
}
