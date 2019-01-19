package cautrucdieukhien;

import java.util.Scanner;

public class Bai4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n = ");
        int n = sc.nextInt();
        int max=0;
        do{
            if(max<n)
                max = n;
            n= sc.nextInt();
        }while(n!=0);
        System.out.print("Max(n) = " +max);
    }
}