package com.dicoding.javafundamental.belajar.annotations;

public class Parent {

    public void tampilMethod() {
        System.out.println("Ini method dari parent class");
    }

    @Deprecated
    public void contohDeprecated() {
    }
}

class Child extends Parent {

    @Override
    public void tampilMethod() {
        System.out.println("Ini method dari child class");
    }
}

class Demo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Parent c = new Child();
        c.tampilMethod();
        c.contohDeprecated();
    }
}
