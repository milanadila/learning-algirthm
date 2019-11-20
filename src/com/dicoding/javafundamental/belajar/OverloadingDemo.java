package com.dicoding.javafundamental.belajar;

public class OverloadingDemo {

    public int sum(int a, int b) {
        return a*b;
    }

    public double sum(double c, double d) {
        return c*d;
    }

    public int sum(int x, int y, int z) {
        return x*y*z;
    }
}
