/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_20_01_2019;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai1 {
    public static void chuc(int x){
        switch(x){
            case 0: System.out.print("Linh ");
                break;
            case 1: System.out.print("Mươi ");
                break;
            case 2: System.out.print("Hai mươi ");
                break;
            case 3: System.out.print("Ba mươi ");
                break;
            case 4: System.out.print("Bốn mươi ");
                break;
            case 5: System.out.print("Năm mươi ");
                break;
            case 6: System.out.print("Sáu mươi ");
                break;
            case 7: System.out.print("Bảy mươi ");
                break;
            case 8: System.out.print("Tám mươi ");
                break;
            case 9: System.out.print("Chín mươi ");
                break;
        }
    }
    public static void donVi(int x){
        switch(x){
            case 0:
                break;
            case 1: System.out.print("mốt");
                break;
            case 2: System.out.print("hai");
                break;
            case 3: System.out.print("ba");
                break;
            case 4: System.out.print("bốn");
                break;
            case 5: System.out.print("năm");
                break;
            case 6: System.out.print("sáu");
                break;
            case 7: System.out.print("bảy");
                break;
            case 8: System.out.print("tám");
                break;
            case 9: System.out.print("chín");
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        //Tách số thành từng hàng(đơn vị, chục, trăm,...)
        int chuc = n/10;
        int dVi = n%10;
        //Đọc các giá trị vừa tách
        chuc(chuc);
        donVi(dVi);
    }
}
