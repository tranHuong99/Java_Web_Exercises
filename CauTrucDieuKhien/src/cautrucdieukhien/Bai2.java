/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautrucdieukhien;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        int gt=1;
        if(n==0 || n==1)
            System.out.println("Ket qua: n! = 1");
        else{
            for(int i=1;i<=n;i++)
                gt *= i;
            System.out.println("Ket qua: n! = " +gt);
        }
    }
}
