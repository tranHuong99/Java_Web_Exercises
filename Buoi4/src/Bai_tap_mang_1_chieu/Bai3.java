/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_tap_mang_1_chieu;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] m = new int[5];
        System.out.println("Nhập mảng: ");
        for(int i=0;i<5;i++){
            System.out.printf("m[%d] = ", i);
            m[i] = sc.nextInt();
        }
        System.out.print("Nhập a = ");
        int a = sc.nextInt();
        for(int i=0;i<5;i++){
            if(a==m[i])
                System.out.printf("Chỉ số: %d ", i);
        }
    }
}
