/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuatcoban;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a> ");
        float a = sc.nextFloat();
        System.out.println("Nhap a> ");
        float b = sc.nextFloat();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Ket qua:");
        System.out.printf("a = %.1f, b = %.1f", a,b);
    } 
}
