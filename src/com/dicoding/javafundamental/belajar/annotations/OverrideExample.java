package com.dicoding.javafundamental.belajar.annotations;


public class OverrideExample {
    void eatSomething() {
        System.out.println("eating something");
    }
}

class Dog extends OverrideExample {
    @Override
    void eatSomething() { //coba ganti jadi eatsomething
        System.out.println("eating food");
    }
}

class TestAnnotations1 {
    public static void main(String[] args) {
        OverrideExample a = new Dog();
        a.eatSomething();
    }
}

/**
 * jadi fungsi anotasi override itu untuk mempermudah kita dalam penulisan method,
 * karna kalo kita nulis method yg ga sesuai dgn parent classnya
 * maka anotasi override itu bisa deteksi kalo method yg ditulis itu ga sesuai. semacam ngecek compile time error
*/
