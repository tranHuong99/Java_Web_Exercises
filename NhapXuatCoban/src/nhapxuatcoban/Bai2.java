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
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a> ");
        float a = sc.nextFloat();
        System.out.println("Nhap b> ");
        float b = sc.nextFloat();
        System.out.println("Nhap c> ");
        float c = sc.nextFloat();
        //Giải phương trình bậc nhất
        if(a==0){
            if(b==0){
                if(c==0)
                    System.out.println("Moi x la nghiem");
                else
                    System.out.println("Phuong trinh vo nghiem");
            }
            else
                System.out.println("Phuong trinh vo nghiem");
        }
        else{
            float x = (c-b)/a;
            System.out.printf("Ket qua x = %.6f", x);
        }
    }
}
