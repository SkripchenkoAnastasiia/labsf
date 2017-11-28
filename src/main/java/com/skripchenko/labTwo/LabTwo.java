package com.skripchenko.labTwo;

/**
 * Created by алло on 20.09.2017.
 */
public class LabTwo {
    public static void main(String[] args) {
        /*System.out.println("Hello, world!");
        String s = "kapusta";
        */String s2 = "Nast";


        int[] mas = new int[5];

        int[][] mas2 = new int[3][3];


        int a = 1;
        int b = 10;
        System.out.println(a + (int) (Math.random() * b));


        int maximum = 0;
        int minimum = 0;

        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = a + (int) (Math.random() * b);
                System.out.println("[" + i + "][" + j + "]=" + mas2[i][j] + ",");
            }


        }
        maximum = mas2[0][0];
        minimum = mas2[0][0];

        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                if (mas2[i][j] > maximum) {
                    maximum = mas2[i][j];
                }
                if (mas2[i][j] < minimum) {
                    minimum = mas2[i][j];
                }
            }
        }
        System.out.println("max = "+maximum+", min = "+minimum);
    }
}