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
public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số > ");
        int n = sc.nextInt();
        System.out.printf("Kết quả: %d^2 = %d", n, n*n);
    }
}
