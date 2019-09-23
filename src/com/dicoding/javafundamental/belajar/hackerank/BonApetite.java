package com.dicoding.javafundamental.belajar.hackerank;

public class BonApetite {
    public static void main(String[] args) {
        int jumlahItem = 4;
        int itemAlergi = 1;
        int anaBill = 7;
        int totalCost = 0;
        int actualTotalCost;
        int [] items = {3, 10, 2, 9};
        int refund;

        for (int i = 0; i < jumlahItem; i++) {
            if (i != itemAlergi) {
                totalCost += items[i];
            }
        }

        actualTotalCost = totalCost/2;

        refund = anaBill - actualTotalCost;

        if (actualTotalCost == anaBill) {
            System.out.println("Bon Apetite");
        } else {
            System.out.println("Refund to Ana: " + refund);
        }
    }
}
