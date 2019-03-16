/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class polylomial {
    //i=0,i<len,i++, j=i;j>=0;j--
    //c[i] = a[j]*b[i-j]
    private int n;
    private int a[];
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n = n;
    }
    public int[] getA(){
        return a;
    }
    public void setA(int a[]){
        this.a = a;
    }
    public polylomial(){
        
    }
    public polylomial(int n, int a[]){
        this.n = n;
        this.a = a;
    }
    public void readPolylomial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bậc của đa thức");
        n = sc.nextInt();
        System.out.println("Nhập vào các tham số: ");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }
    public void sumPolylomial(){
        
    }
}
