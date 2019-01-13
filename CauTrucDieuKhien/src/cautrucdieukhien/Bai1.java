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
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        float a = sc.nextFloat();
        System.out.println("Nhap b = ");
        float b = sc.nextFloat();
        System.out.println("Nhap c = ");
        float c = sc.nextFloat();
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                    System.out.printf("Moi x la nghiem");
                else
                    System.out.printf("Phuong trinh vo nghiem");
            }
            else
            {
                System.out.printf("Phuong trinh co 1 nghiem don\n");
                System.out.printf("x = %.5f", -c/b);
            }
        }
        else
        {
            float delta;
            delta = b*b - 4*a*c;
            if(delta>0)
            {
                System.out.printf("Phuong trinh co 2 nghiem phan biet\n");
                System.out.printf("x1 = %.5f\n", (-b-sqrt(delta))/(2*a));
                System.out.printf("x2 = %.5f\n", (-b+sqrt(delta))/(2*a));
            }
            else if(delta==0)
            {
                System.out.printf("Phuong trinh co nghiem kep\n");
                System.out.printf("x1 = x2 = %.5f", -b/(2*a));
            }
            else
                System.out.printf("Phuong trinh vo nghiem");
        }
    }
}
