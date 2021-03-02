package me.uwu.matrice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Matrix {
    public Vector<Vector<Double>> matrix;

    public Matrix(Vector<Vector<Double>> matrix) {
        this.matrix = matrix;
    }

    public Matrix(){
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
            for (int j = 0; j < matrix.get(0).size(); j++) {
                System.out.print("[" + r.get(j) + "]\t");
            }
            System.out.println();
        }
    }

    public static Matrix randomMatrixDouble(int x, int y){
        Matrix mat = new Matrix();
        for(int i=0;i<x;i++){
            Vector<Double> r=new Vector<>();
            for(int j=0;j<y;j++){
                r.add(Math.random());
            }
            mat.matrix.add(r);
        }
        return mat;
    }

    public static Matrix randomMatrix(int x, int y){
        Matrix mat = new Matrix();
        for(int i=0;i<y;i++){
            Vector<Double> r=new Vector<>();
            for(int j=0;j<x;j++){
                r.add((double) ((int)(Math.random()*256)));
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
}
