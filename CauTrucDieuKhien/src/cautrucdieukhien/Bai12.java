/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautrucdieukhien;

import static cautrucdieukhien.Bai11.chuc;
import static cautrucdieukhien.Bai11.donVi;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai12 {
        public static void  tram(int x){
        switch(x){
            case 0: System.out.print("Không trăm ");
                break;
            case 1: System.out.print("Một trăm ");
                break;
            case 2: System.out.print("Hai trăm ");
                break;
            case 3: System.out.print("Ba trăm ");
                break;
            case 4: System.out.print("Bốn trăm ");
                break;
            case 5: System.out.print("Năm trăm ");
                break;
            case 6: System.out.print("Sáu trăm ");
                break;
            case 7: System.out.print("Bảy trăm ");
                break;
            case 8: System.out.print("Tám trăm ");
                break;
            case 9: System.out.print("Chín trăm ");
                break;
        }
    }
        public static void chuc(int x){
        switch(x){
            case 0: System.out.print("linh ");
                break;
            case 1: System.out.print("mươi ");
                break;
            case 2: System.out.print("hai mươi ");
                break;
            case 3: System.out.print("ba mươi ");
                break;
            case 4: System.out.print("bốn mươi ");
                break;
            case 5: System.out.print("năm mươi ");
                break;
            case 6: System.out.print("sáu mươi ");
                break;
            case 7: System.out.print("bảy mươi ");
                break;
            case 8: System.out.print("tám mươi ");
                break;
            case 9: System.out.print("chín mươi ");
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
        int tram = n/100;
        int chuc = (n/10)%10;
        int dVi = n%10;
        //Đọc các giá trị vừa tách
        tram(tram);
        chuc(chuc);
        donVi(dVi);
    }
}
