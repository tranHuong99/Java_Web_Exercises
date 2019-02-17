/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_tap_mang_1_chieu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai4 {
    public static void main(String args[]){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo mảng ngẫu nhiên 15 phần tử: ");
        for(int i=0;i<15;i++){
            int number = rd.nextInt();
            System.out.printf("%d ", number);
        }
    }
}
