package com.skripchenko.labSix;

import java.util.List;

public class MinMaxList {
    public int lengthMatrix;
    public int widthMatrix;

    public void setWidth(Mattrix matrix) { this.widthMatrix = matrix.getWidth(); }
    public void setLength(Mattrix matrix) {
        this.lengthMatrix = matrix.getLength();
    }

    public int getMaximum(Mattrix matrix) {
        int max = matrix.getRandomMatrix().get(0).get(0);
        lengthMatrix= matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getRandomMatrix()) {
            for (Integer value : lists) {
                if (max < value)
                    max = value;
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public int getMinimum(Mattrix matrix) {
        int min = matrix.getRandomMatrix().get(0).get(0);
        lengthMatrix = matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getRandomMatrix()) {
            for (Integer value : lists) {
                if (min > value)
                    min = value;
            }
        }
        System.out.println("Min: " + min);
        return min;
    }
}