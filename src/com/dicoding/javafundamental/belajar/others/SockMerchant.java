package com.dicoding.javafundamental.belajar.others;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("n : ");
//        int n = scan.nextInt();
//
//        HashMap inventory = new HashMap<Integer, Integer>();
//
//        int matchingPairs = 0;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("color : ");
//            int color = scan.nextInt();
//
//            if (inventory.containsKey(color) && inventory.get(color).equals(new Integer(1))){
//                inventory.put(color, 0);
//                matchingPairs++;
//                continue;
//            }
//
//            inventory.put(color, 1);
//        }
//
//        System.out.println("output : " + matchingPairs);

        int n = 9;
        int[] sock = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        HashMap inventory = new HashMap<Integer, Integer>();
        int matchingPairs = 0;

        for (int i = 0; i < n; i++) {
            int color = sock[i];

            if (inventory.containsKey(color) && inventory.get(color).equals(new Integer(1))) {
                inventory.put(color, 0);
                matchingPairs++;
                continue;
            }
            inventory.put(color, 1);
        }

        System.out.println("output : " + matchingPairs);
    }
}
