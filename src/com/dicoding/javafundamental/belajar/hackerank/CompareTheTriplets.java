package com.dicoding.javafundamental.belajar.hackerank;

public class CompareTheTriplets {
    public static void main(String[] args) {
        int b0 = 5;
        int b1 = 6;
        int b2 = 7;

        int a0 = 3;
        int a1 = 6;
        int a2 = 10;

        int alice = 0;
        int bob = 0;

        if (b0 < a0) {
            bob += 1;
        } if (b0 > a0) {
            alice +=1;
        } if (b1 < a1) {
            bob += 1;
        } if (b1 > a1) {
            alice += 1;
        } if (b2 < a2) {
            bob += 1;
        } if (b2 > a2) {
            alice += 1;
        }

        System.out.println(alice + " " + bob);
    }
}
