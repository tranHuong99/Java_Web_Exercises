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
public class Bai7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int fn, f0 = 0, f1 = 1;
        System.out.print("Dãy Fibonaci: ");
        for(int i=0;i<n;i++){
            if(n==0 || n==1)
                fn = 1;
            else{
                fn = f0 +f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.printf("%d ", fn);
        }
    }
}
