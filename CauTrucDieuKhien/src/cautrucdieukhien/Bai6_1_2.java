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
public class Bai6_1_2 {
    public static int GCD(int a, int b){
        int r;
        while(b!=0){
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    public static int LCM(int a, int b){
        return a/GCD(a,b)*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = sc.nextInt();
        System.out.print("Nhập b = ");
        int b = sc.nextInt();
        System.out.println("UCLN của a và b là: " +GCD(a,b));
        System.out.println("BCNN của a và b là: " +LCM(a,b));
        
    }
}
