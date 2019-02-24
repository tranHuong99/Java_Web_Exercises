/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_tap_mang_1_chieu.Bai_tap_mang_2_chieu;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
        System.out.println("Nhập ma trận thứ nhất: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("m[%d][%d] = ", i,j);
                mat1[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Nhập ma trận thứ hai: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("m[%d][%d] = ", i,j);
                mat2[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Tổng 2 ma trận: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat3[i][j] = mat1[i][j]+mat2[i][j]; 
            }
        }
    }
}
