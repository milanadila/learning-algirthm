package com.dicoding.javafundamental.belajar.hackerank;

public class GreedyFlorist {
    public static void main(String[] args) {

        int n = 3;
        int k =  2;
        int[] flower = {2, 5, 6};
        int cost = 0;
        int normalCost = 0;

        if (n == k) {
            for (int m = 0; m < n; m++) {
                int value = flower[m];
                normalCost += value;
            }
            System.out.println("total : " + normalCost);
        } else {
            for (int i = n-1; i >= k-1; i --) {
                int value = flower[i];
                normalCost += value;
            }
            for (int j = 0; j < k-1; j++) {
                int value = flower[j];
                cost += value;
            }
            int totalCost = normalCost + (cost*2);
            System.out.println("total : " + totalCost);
        }
    }
}
