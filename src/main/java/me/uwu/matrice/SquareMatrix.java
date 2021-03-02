package me.uwu.matrice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SquareMatrix {
    public Vector<Vector<Double>> matrix;

    public SquareMatrix(Vector<Vector<Double>> matrix) {
        this.matrix = matrix;
    }

    public SquareMatrix(){
        matrix = new Vector<>();
    }

    public Vector<Vector<Double>> getMatrix() {
        return matrix;
    }

    public void setMatrix(Vector<Vector<Double>> matrix) {
        this.matrix = matrix;
    }

    public double sum(){
        double sum = 0;
        for (Vector<Double> rows : matrix)
            for (double x : rows)
                sum+=x;
        return sum;
    }

    public double multiply(){
        double multiply = 1;
        for (Vector<Double> rows : matrix)
            for (double x : rows)
                multiply = x*multiply ;
        return multiply;
    }

    public void print(){
        for (Vector<Double> r : matrix) {
            for (int j = 0; j < matrix.size(); j++) {
                System.out.print("[" + r.get(j) + "]\t");
            }
            System.out.println();
        }
    }

    public static SquareMatrix randomMatrixDouble(int x){
        SquareMatrix mat = new SquareMatrix();
        for(int i=0;i<x;i++){
            Vector<Double> r=new Vector<>();
            for(int j=0;j<x;j++){
                r.add(Math.random());
            }
            mat.matrix.add(r);
        }
        return mat;
    }

    public List<Double> toList(){
        List<Double> list = new ArrayList<>();
        for (Vector<Double> rows : matrix)
            list.addAll(rows);
        return list;
    }

    public void rotate(){
        for (int x = 0; x < matrix.size() / 2; x++) {
            for (int y = x; y < matrix.size() - x - 1; y++) {
                double last = matrix.get(x).get(y);
                matrix.get(x).add(y, matrix.get(matrix.size() - 1 - y).get(x));
                matrix.get(matrix.size() - 1 - y).add(x, matrix.get(matrix.size() - 1 - x).get(matrix.size() - 1 - y));
                matrix.get(matrix.size() - 1 - x).add(matrix.size() - 1 - y, matrix.get(y).get(matrix.size() - 1 - x));
                matrix.get(y).add(matrix.size() - 1 - x,last);
            }
        }
    }

    public static SquareMatrix randomMatrix(int x){
        SquareMatrix mat = new SquareMatrix();
        for(int i=0;i<x;i++){
            Vector<Double> r=new Vector<>();
            for(int j=0;j<x;j++){
                r.add((double) ((int)(Math.random()*256)));
            }
            mat.matrix.add(r);
        }
        return mat;
    }
}
