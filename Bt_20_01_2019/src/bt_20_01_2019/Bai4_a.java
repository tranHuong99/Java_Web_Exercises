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
public class Bai4_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao h = ");
        int h = sc.nextInt();
        //Tam giác cân đặc
        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++)
                System.out.printf(" ");
            for(int j=1;j<=2*i-1;j++){
                if(i==1 || i==h)
                    System.out.printf("*");
                else{
                    if(j==1 || j==2*i-1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }                    
            }
            System.out.printf("\n");
        }

    }
}
