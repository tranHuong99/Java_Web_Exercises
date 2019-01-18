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
public class Bai5_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int gt=1, Sum = 0;
        for(int i=1;i<=n;i++){
            gt *= i;
            Sum += gt;
        }
        System.out.print("S(n) = " +Sum);
    }
}
