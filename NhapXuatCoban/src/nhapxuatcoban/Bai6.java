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
public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a> ");
        int a = sc.nextInt();
        if(a%2==0)
            System.out.println("Ket qua:\na la so chan");
        else 
            System.out.println("Ket qua:\na la so le");
    }
}
