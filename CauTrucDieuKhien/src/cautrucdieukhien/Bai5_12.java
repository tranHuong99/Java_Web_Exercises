/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautrucdieukhien;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai5_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int Sum = 0;
        double S_n = 0;
        for(int i=1;i<=n;i++){
            Sum += i;
            S_n += 1.0/Sum;
        }
        System.out.print("S(n) = " +S_n);
    }
}
