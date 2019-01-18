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
public class Bai5_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        double Sum = 0;
        for(int i=0;i<=n;i++){
            Sum += (double)(2*i+1)/(2*i+2);
        }
        System.out.println("S(n) = " +Sum);
    }
}
