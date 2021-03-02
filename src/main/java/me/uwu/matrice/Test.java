package me.uwu.matrice;

public class Test {
    public static void main(String[] args) {
        SquareMatrix matrix = SquareMatrix.randomMatrix(5);
        System.out.println("x:" + matrix.matrix.get(0).size() + " y:" + matrix.matrix.size());
        matrix.print();
        System.out.println();
        matrix.rotate();
        matrix.print();
    }
}
