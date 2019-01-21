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
public class Bai11_1 {
    public static void tachSo(int n){
        int temp, count=0;
        String str = new String();
        while(n!=0){
            temp = n%10;
            n /= 10;
            count++;
            switch(count){
                case 1: System.out.print("hang don vi");
                    break;
                case 2: System.out.print("hang chuc");
                    break;
                case 3: System.out.print("hang tram");
                    break;
            }
        }
    }
    public static String chuyenDoiGiaTri(int n){
        String str = new String();
        switch(n){
            case 0: str = "không";
                break;
            case 1: str = "một";
                break;
            case 2: str = "hai";
                break;
            case 3: str = "ba";
                break;
            case 4: str = "bốn";
                break;
            case 5: str = "năm";
                break;
            case 6: str = "sáu";
                break;
            case 7: str = "bảy";
                break;
            case 8: str = "tám";
                break;
            case 9: str = "chín";
        }
        return str;
    }
    public static String chuyenDoiHang(int count){
        String str = new String();
        switch(count){
            case 0: break;
            case 1: str = chuyenDoiGiaTri(count);
            case 2: str = "mươi";
            case 3: str = "trăm";
        }
        return str;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n = ");
        int n = sc.nextInt();
        String str = new String();
        System.out.printf("Số %d đọc là %s %s", n, chuyenDoiGiaTri(str), chuyenDoiHang(str));
        
    }
}
