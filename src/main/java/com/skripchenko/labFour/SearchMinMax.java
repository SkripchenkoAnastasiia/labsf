package com.skripchenko.labFour;

import java.util.List;

public class SearchMinMax {
    public Integer getMaximumWithApi(Matrix matrix) {
        int countLists = matrix.getCountLists();
        for (int i = 1; i < countLists; i++){
            matrix.getMatrix().get(0).addAll(matrix.getMatrix().get(i));
        }
        Integer maximum = matrix.getMatrix().get(0).stream().max(Integer::compareTo).get();
        return maximum;
    }

    public Integer getMinimumWithApi(Matrix matrix) {
        int countLists = matrix.getCountLists();
        for (int i = 1; i < countLists; i++){
            matrix.getMatrix().get(0).addAll(matrix.getMatrix().get(i));
        }
        Integer minimum = matrix.getMatrix().get(0).stream().min(Integer::compareTo).get();
        return minimum;
    }

    public int getMaximum(Matrix matrix) {
        int maximum = matrix.getMatrix().get(0).get(0);

        for (List<Integer> lists : matrix.getMatrix()) {
            for (Integer num : lists) {
                if (maximum < num)
                    maximum = num;
            }
        }
        return maximum;
    }

    public int getMinimum(Matrix matrix) {
        int minimum =  matrix.getMatrix().get(0).get(0);
        for (List<Integer> lists :  matrix.getMatrix()) {
            for (Integer num : lists) {
                if (minimum  > num)
                    minimum  = num;
            }
        }
        return minimum ;
    }
}