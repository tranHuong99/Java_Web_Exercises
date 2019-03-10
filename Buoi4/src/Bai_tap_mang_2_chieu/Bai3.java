/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_tap_mang_2_chieu;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Nhập ma trận: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("m[%d][%d] = ", i,j);
                matrix[i][j] = sc.nextInt(); 
            }
        }
        boolean flag = true;
        for(int i=0;i<3-1;i++){
            for(int j=i+1;j<3;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Ma trận đối xứng");
        else
            System.out.println("Ma trận không đối xứng");
    }
}
