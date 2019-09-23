package com.dicoding.javafundamental.belajar.hackerank;

public class MigratoryBirds {
    public static void main(String[] args) {
        int typeOfBird = 6;
        int[] birds = {1, 4, 4, 4, 5, 3};
        int sameType = 0;
        int totalBird = 0;

        for (int i = 0; i < typeOfBird; i ++) {
            int valueBird = birds[i];
            if (valueBird == sameType) {
                sameType = valueBird;
            }

            if (valueBird < sameType) {
                totalBird += 1;
            }
        }

        System.out.println("Output : " + totalBird);

    }
}
