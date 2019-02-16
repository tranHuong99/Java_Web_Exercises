/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_20_01_2019;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai5_a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập m = ");
        int m = sc.nextInt();
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
