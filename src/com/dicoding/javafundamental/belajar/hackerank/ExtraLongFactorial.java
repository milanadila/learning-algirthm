package com.dicoding.javafundamental.belajar.hackerank;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("factorial : ");
        Integer num = scan.nextInt();
//        int num = 25;
        BigDecimal factorial = BigDecimal.valueOf(1);

        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(new BigDecimal(i));
        }

        System.out.println("Factorial of " + num + " : " + factorial);
    }
}
