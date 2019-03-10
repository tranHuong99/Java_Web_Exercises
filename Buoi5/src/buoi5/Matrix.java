/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

/**
 *
 * @author HUONG XINH GAI
 */
public class Matrix {
    private int row;
    private int col;
    private int[][] values;
    public Matrix(){
        this.row = 3;
        this.col = 3;
        this.values = new int[3][3];
    }
    public Matrix(int row, int col, int[][] values){
        this.row = row;
        this.col = col;
        this.values = values;
    }
    public int getRow(){
        return row;
    }
    public void setRow(int row){
        this.row = row;
    }
    public int getCol(){
        return col;
    }
    public void setCol(int col){
        this.col = col;
    }
    public int[][] getValues(){
        return values;
    }
    public void setValues(int[][] values){
        this.values = values;
    }
    public static void main(String[] args){
        Matrix mt = new Matrix();
    }
}
