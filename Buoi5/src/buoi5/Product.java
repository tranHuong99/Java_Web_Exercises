/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

/**
 *
 * @author HUONG XINH GAI
 */
public class Product {
    private String Name;
    private String Description;
    private double Price;
    private  int[] rate;
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getDescription(){
        return Description;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }

}
