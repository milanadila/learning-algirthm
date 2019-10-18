package com.dicoding.javafundamental.belajar.hackerank;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("input string : ");
//        String input = scan.nextLine();
        String input = "have a nice day";
        String withoutSpace = input.replaceAll("\\s+", "");
        int nameLength = withoutSpace.length();
        System.out.println("string without space : " + withoutSpace);
        System.out.println("length of string :" + nameLength);

        int x = (int)Math.sqrt(nameLength);
        System.out.println("x : " + x);
        int count = 0;
        char array[] = withoutSpace.toCharArray();

        for (int i = 0; i < x; i ++) {
            int j = i;
            while (j < nameLength) {
                System.out.print(array[j]);
                j += x;
                count++;
            }
            System.out.print(" ");
        }

    }
}
