/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi13;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUONG XINH GAI
 */
public class Buoi13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyException ex = new MyException();
        int a = ex.inputNumber();
        System.out.println("a = " +a);
        int b = ex.inputNumber();
        System.out.println("b = " +b);
        System.out.println("a/b = " +a/b);
    }
    
}
