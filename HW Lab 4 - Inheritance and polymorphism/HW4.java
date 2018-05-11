/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STAN-PC
 */
public class HW4 {
    
    public static void main(String[] args) {
        Food milk = new Food("Milk",2.50,20,4);
        System.out.println(milk.price()); // works
        Jewel bracelet = new Jewel("Grivna",50,50,true);
        bracelet.print();
        System.out.println(bracelet.price()); // works
        
        FoodsShop billa = new FoodsShop(10);
        Food bread = new Food("Bread",1,10,3);
        billa.addFood(milk);
        billa.addFood(bread);
        billa.print(); // works
        System.out.println(billa.totalRevenue()); // because of expiration dates is lower
        
        
        JewelryShop perla = new JewelryShop(5);
        Jewel ring = new Jewel("Ring",100,20,false);
        
        perla.addJewelry(ring);
        perla.addJewelry(bracelet);
        System.out.println();
        
        perla.print();
        System.out.println(perla.totalRevenue()); // works perfectly
        
    }
    
    
}
