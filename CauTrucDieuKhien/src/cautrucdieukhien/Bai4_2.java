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
public class Bai4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n = ");
        int n = sc.nextInt();
        int min=0;
        do{
            if(min>n)
                min = n;
            n= sc.nextInt();
        }while(n!=0);
        System.out.print("Max(n) = " +min);
    }
}
