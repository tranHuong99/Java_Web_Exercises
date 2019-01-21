/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cautrucdieukhien;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai11_1 {
    public static int tachSo(int n){
        int temp, count=0;
        String str = new String();
        while(n!=0){
            temp = n%10;
            n /= 10;
            count++;
        }
        switch(count){
            case 1: str = "một, hai, ba, bốn, năm, sáu, bảy, tám, chín";
                break;
            case 2: str = "mươi";
                break;
            case 3: str = "trăm";
                break;
        }
    }
    public static void main(String[] args){
        
    }
}
