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
public class Bai8 {
    public static int giaithua(int n)
    {
        int giai_thua = 1;
        for (int i = 1; i <= n + 1; i++)
        {
            giai_thua = giai_thua*i;
        }
    return giai_thua;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x = ");
        int x = sc.nextInt();
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        double Sin_x =0;
        for(int i=0;i<=n;i++){
            Sin_x += pow(-1,i)*pow(x, 2*i+1)/giaithua(2*i+1);
        }
        System.out.print("Sin(x) = " +Sin_x);
    }
}
