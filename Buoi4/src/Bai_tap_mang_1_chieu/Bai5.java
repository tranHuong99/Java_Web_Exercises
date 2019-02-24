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
public class Bai5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vector A: ");
        System.out.printf("xA = ");
        int xA = sc.nextInt();
        System.out.printf("yA = ");
        int yA = sc.nextInt();
        System.out.printf("zA = ");
        int zA = sc.nextInt();
        System.out.print("Vector B: ");
        System.out.printf("xB = ");
        int xB = sc.nextInt();
        System.out.printf("yB = ");
        int yB = sc.nextInt();
        System.out.printf("zB = ");
        int zB = sc.nextInt();
        System.out.printf("Tổng của 2 vector A+B = vector C: (xC=%d, yC=%d, zC=%d)\n", xA+xB, yA+yB, zA+zB);
        System.out.printf("Tích vô hướng của 2 vector là: %d", xA*xB+yA*yB+zA*zB);
    }
}
