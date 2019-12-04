package com.dicoding.javafundamental.belajar.annotations;

public class DeprecatedExample {
    void m() {
        System.out.println("hello m");
    }

    @Deprecated
    void n() {
        System.out.println("hello n");
    }
}

class TestAnnotation3 {
    public static void main(String[] args) {
        DeprecatedExample a = new DeprecatedExample();
//        a.m;
    }
}
