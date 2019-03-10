/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Vector {
    private int first_abscissa;
    private int first_ordinate;
    private int last_abscissa;
    private int last_ordinate;
    public int get_first_abscissa(){
        return first_abscissa;
    }
    public void set_first_abscissa(int first_Abscissa){
        this.first_abscissa = first_abscissa;
    }
    public int get_last_abscissa(){
        return last_abscissa;
    }
    public void set_last_abscissa(int last_abscissa){
        this.last_abscissa = last_abscissa;
    }
    public int get_first_ordinate(){
        return first_ordinate;
    }
    public void set_first_ordinate(int first_ordinate){
        this.first_ordinate = first_ordinate;
    }
    public int get_last_ordinate(){
        return last_ordinate;
    }
    public void set_last_ordinate(int last_ordinate){
        this.last_ordinate = last_ordinate;
    }
    public Vector(){
        
    }
    public Vector(int hoanhDoDau, int tungDoDau, int hoanhDoCuoi, int tungDoCuoi){
        first_abscissa = hoanhDoDau;
        first_ordinate = tungDoDau;
        last_abscissa = hoanhDoCuoi;
        last_ordinate = tungDoCuoi;
    }
    Scanner sc = new Scanner(System.in);
    public void read_Vector(){
        System.out.println("Read first_abscissa: ");
        first_abscissa = sc.nextInt();
        System.out.println("Read first_ordinate: ");
        first_ordinate = sc.nextInt();
        System.out.println("Read last_abscissa: ");
        last_abscissa = sc.nextInt();
        System.out.println("Read last_ordinate: ");
        last_ordinate = sc.nextInt();
    }
    double size_v1 = sqrt(first_abscissa*first_abscissa + first_ordinate*first_ordinate);
    double size_v2 = sqrt(last_abscissa*last_abscissa + last_ordinate*last_ordinate);
    public boolean test_Vector(){
        if(size_v1 == size_v2)
            return true;
        else
            return false;
    }
    public double corner_Vectors(){
        double numerator = first_abscissa*first_ordinate + last_abscissa*last_ordinate;
        double denominator = size_v1*size_v2;
        double corner = numerator/denominator;
        return corner;
    }
    public static void main(String[] args){
        Vector v = new Vector();
        v.read_Vector();
        if(v.test_Vector())
            System.out.println("Two vectors are equal");
        else
            System.out.println("Two vectors are not equal");
        System.out.println("Corner between two vectors: " +v.corner_Vectors());
    }
}
