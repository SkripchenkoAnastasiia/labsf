package com.skripchenko.labFour;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Matrix myCollection = new Matrix();
        myCollection.setCountLists(2);
        myCollection.setCountElements(2);
        myCollection.createMatrix();
        myCollection.showMatrix(myCollection.getMatrix());

        SearchMinMax searching = new SearchMinMax();

        System.out.println("API = " + searching.getMaximumWithApi(myCollection));
        System.out.println("API = " + searching.getMinimumWithApi(myCollection));
        System.out.println("Maximum = " + searching.getMaximum(myCollection));
        System.out.println("Minimum = " + searching.getMinimum(myCollection));


    }
}