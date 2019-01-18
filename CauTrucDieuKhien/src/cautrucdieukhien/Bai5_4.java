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
public class Bai5_4 {
    public static void main(String[] args){
        //đây là bài 5.4
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        double Sum = 0;
        for(int i=1;i<=n;i+=2)
            Sum += 1.0/(2*i);
        System.out.println("S(n) = " +Sum);
    }
}
