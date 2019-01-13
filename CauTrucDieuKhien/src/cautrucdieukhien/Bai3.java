/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautrucdieukhien;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x= ");
        int x = sc.nextInt();
        int test = 1;
        int k = (int)sqrt(x);
        for(int i=2;i<=k;i++)
        {
            if(x%i==0)
             {
                 test = 0;
                 break;
             }
        }
        System.out.printf("%d so nguyen to dau tien la: ", x);
    }
}
