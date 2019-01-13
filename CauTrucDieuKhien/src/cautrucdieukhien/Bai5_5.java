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
public class Bai5_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        double Sum = 0;
        for(int i=1;i<=n;i++)
            Sum += 1.0/(i*(i+1));
        System.out.println("S(n) = " +Sum);
    }
}
