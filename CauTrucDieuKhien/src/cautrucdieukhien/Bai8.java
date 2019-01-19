/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautrucdieukhien;

import static java.lang.Math.abs;
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
        for (int i=1; i<=n; i++)
        {
            giai_thua *= i;
        }
    return giai_thua;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập goc > ");
        double x = sc.nextDouble(); //đơn vị là độ
        //đổi đơn vị sang rad
        double xRad = x*Math.PI /180;
        double ERR = 0.0001;
        double dif = 0;
        double Sin_x=0;
        int i=0;
        do{
            dif = pow(-1,i)*pow(xRad, 2*i+1)/giaithua(2*i+1);
            Sin_x += dif;
            i++;
        }while(abs(dif) > ERR);
        System.out.print("Sin(x) = " +Sin_x);
    }
}
