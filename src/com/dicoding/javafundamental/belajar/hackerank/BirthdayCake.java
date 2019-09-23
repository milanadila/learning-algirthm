package com.dicoding.javafundamental.belajar.hackerank;

public class BirthdayCake {
    public static void main(String[] args) {
        int candle = 4;
        int[] candles = {4, 2, 1, 4};
        int higherCandle = 0;
        int totalCandle = 0;

        for (int i = 0; i < candle; i++) {
            int valueCandle = candles[i];
          if (valueCandle > higherCandle) {
              higherCandle = valueCandle;
          }
          if (valueCandle == higherCandle) {
              totalCandle += 1;
          }
        }

        System.out.println("Total candle : " + totalCandle);
    }
}
