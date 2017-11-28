package com.skripchenko.labSix;


        import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

public class Mattrix {

    private List<List<Integer>> matrix = new ArrayList();
    public Author author;
    private int matrixLength;
    private int widthMatrix;
    public void setLength(int lengthMatrix) { this.matrixLength = lengthMatrix; }
    public void setWidth(int widthMatrix) {
        this.widthMatrix = widthMatrix;
    }
    public int getLength() {
        return matrixLength;
    }
    public int getWidth() {
        return widthMatrix;
    }
    public Mattrix(Author author) {
        this.author = author;
    }
    public void printMatrix() {
        matrix.forEach(System.out::println);
    }

    public List<List<Integer>> getRandomMatrix() {
        Random rand = new Random();
        for (int i = 0; i < matrixLength; i++) {
            List<Integer> list = new ArrayList();
            for (int j = 0; j < widthMatrix; j++) {
                list.add(rand.nextInt(100));
            }
            matrix.add(list);
        }
        return matrix;
    }
    @Override
    public boolean equals(Object object) {
        if (this ==  object) return true;
        if ( object == null || getClass() !=  object.getClass()) return false;
        Mattrix matrixOBject = (Mattrix)  object;
        if (matrixLength != matrixOBject.matrixLength) return false;
        if (widthMatrix != matrixOBject.widthMatrix) return false;
        if (!matrix.equals(matrixOBject.matrix)) return false;
        return author.equals(matrixOBject.author);
    }
}