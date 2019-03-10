/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class MyDate {
    private int date;
    private int month;
    private int year;
    public MyDate(){
        
    }
    public MyDate(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date = date;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setMonth(String month){
        if(month.toLowerCase().equals("May"))
            this.month = 5;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public String toString(){
        return this.date+"/"+this.month+"/"+this.year+"/";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyDate md = new MyDate();
        System.out.println("Date");
        md.setMonth("May");
        System.out.println(md);
    }
}
