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
public class Bai1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] m = new int[5];
        System.out.println("Nhập mảng: ");
        for(int i=0;i<5;i++){
            System.out.printf("m[%d] = ", i);
            m[i] = sc.nextInt();
        }
        System.out.println("In mảng: ");
        for(int i=0;i<5;i++){
            System.out.printf("%d ", m[i]);
        }
        System.out.println("");
        int sum = 0;
        for(int i=0;i<5;i++){
            sum += m[i];
        }
        System.out.println("Tổng các phần tử mảng = " +sum);
        int sum_odd = 0, sum_even = 0;
        for(int i=0;i<5;i++){
            if(m[i]%2!=0)
                sum_odd += m[i];
            else
                sum_even += m[i];
        }
        System.out.println("Tổng lẻ = " +sum_odd);
        System.out.println("Tổng chẵn = " +sum_even);
    }
}
