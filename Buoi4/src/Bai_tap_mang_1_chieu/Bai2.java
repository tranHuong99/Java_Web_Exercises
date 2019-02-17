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
public class Bai2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] m = new int[5];
        System.out.println("Nhập mảng: ");
        for(int i=0;i<5;i++){
            System.out.printf("m[%d] = ", i);
            m[i] = sc.nextInt();
        }
        int max = m[0], min = m[0];
        for(int i=0;i<5;i++){
            if(max<m[i])
                max = m[i];
            if(min>m[i])
                min = m[i];
        }
        System.out.println("Max = " +max);
        System.out.println("Min = " +min);
        System.out.println("Các phần tử mảng chia hết cho 3 là:");
        for(int i=0;i<5;i++){
            if(m[i]%3==0)
                System.out.printf("%d ", m[i]);
        }
    }
}
