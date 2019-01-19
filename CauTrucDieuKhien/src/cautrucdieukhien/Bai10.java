/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautrucdieukhien;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int reverse=0, rem, temp = n;
        while(temp != 0)
        {
            rem = temp % 10;
            reverse = reverse*10 + rem;
            temp /= 10;
        } 
        if(reverse == n) 
            System.out.printf("%d la so doi xung", n);
        else
            System.out.printf("%d khong doi xung", n);
    }
}
