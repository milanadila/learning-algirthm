package com.dicoding.javafundamental.belajar.hackerank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Solution {
    // Complete the encryption function below.
    static String encryption(String s) {
        String withoutSpace = s.replaceAll("\\s+", "");
        int nameLength = withoutSpace.length();

        double x = Math.sqrt(nameLength);
        int z = (int)Math.floor(x);
        int y = (int)Math.ceil(x);
        int count = 0;
        char array[] = withoutSpace.toCharArray();
        int j = 0;

        if ((z*y) < nameLength) {
            z = y;
        }
        char arry [][] = new char[z][y];
        for (int i = 0; i < nameLength ; ) {
            for (int k = 0; k < y; k++) {
                if(i < nameLength){
                    char value = array[i];
                    arry[j][k] = value;
                    i++;
                }
            }

            j++;
        }

        char encrypt [][] = new char[y][z];
        for (int i = 0; i < y ; i++) {
            for (int k = 0; k < z; k++) {
                char value = arry[k][i];
                encrypt[i][k] = value;
            }
        }


        String[] arryResult = new String[y];
        for (int i = 0; i < encrypt.length; i ++) {
            String resultEncrypt = "";
            for (int k = 0; k < encrypt[i].length;  k++) {

                resultEncrypt +=  encrypt[i][k];
            }
            arryResult[i] = resultEncrypt.trim();
        }
        String joined = String.join(" ", arryResult);

        return joined;
    }


//        for (int i = 0; i < x; i ++) {
//            int j = i;
//            while (j < nameLength) {
//                arr = array[j];
//                System.out.print(arr);
//                j += y;
//                count++;
//            }
//
//            result = String.valueOf(arr);
//        }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = scanner.nextLine();
        String s = "chillout";

        String result = encryption(s);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}
