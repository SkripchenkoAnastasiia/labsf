package com.skripchenko.labThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabThree{

    public static int[][] CreateMasbyHandsKvadr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность квадратной матрицы ");
        int n = Integer.parseInt(reader.readLine());

        int[][] mas = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("Введите значение элемента массива ["+i+"]["+j+"]=");
                mas[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return mas;
    }

    public static int[][] CreateMasbyHandsNoKvadr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличество строк в  матрице ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите колличество столбцов в  матрице ");
        int m = Integer.parseInt(reader.readLine());

        int[][] mas = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("Введите значение элемента массива ["+i+"]["+j+"]=");
                mas[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return mas;
    }



    public static int Searchmax( int [][] mas){

        int maximum = mas[0][0];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > maximum)
                    maximum = mas[i][j];

            }
        }
        return maximum;
    }

    public static int Searchmin(int[][] mas){

        int minimum = mas[0][0];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < minimum)
                    minimum = mas[i][j];

            }
        }
        return minimum;
    }

    public static void main(String[] args) throws IOException {

        int[][] mas = CreateMasbyHandsNoKvadr();

        System.out.println("max = "+Searchmax(mas));

        System.out.println("min = "+Searchmin(mas));
    }
}
