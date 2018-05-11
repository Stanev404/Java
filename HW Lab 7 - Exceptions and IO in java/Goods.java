
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Goods implements Serializable  {
    private String name_of_good;
    private double price_before;
    private double percent;

    public Goods(String name_of_good, double price_before, double percent) {
        this.name_of_good = name_of_good;
        this.price_before = price_before;
        this.percent = percent;
    }
    
    double final_price(){
        return (this.price_before + this.price_before*this.percent/100);
    }
    
    @Override
    public String toString(){
        return "Name of good: " + this.name_of_good  + System.lineSeparator() + "Price before: " + this.price_before + System.lineSeparator() + "Overcharge percent: " + this.percent;
    }
   
    
    
        Goods(){};
}

