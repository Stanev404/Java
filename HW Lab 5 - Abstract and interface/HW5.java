/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author STAN-PC
 */
public class HW5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box kutiq = new Box(3,5,10);
        Material wood = new Material("wood",false);
        Material glass = new Material("glass",true);
        Material metal = new Material("metal",false);
        Material leather = new Material("leather",false);
        
        Element prozorec = new Element(5,glass);
        Element leglo = new Element(25,wood);
       //System.out.println(durvo);
        //System.out.println(leglo);
        
       // System.out.println(kola.get_delivery_price());
       Element H350 = new Element(5,metal);
        Furniture tv = new Furniture("Philips",kutiq,"Street manhatan",6,10);
        tv.addElement(H350);
        tv.show_elements();
        System.out.println();

        Element addidas_predator = new Element(2,leather);
        Shoes addidas = new Shoes(true,kutiq,"Street oregon",5,2);
        addidas.addElement(addidas_predator);
        System.out.println(addidas);
        
        CourierCompany econt = new CourierCompany(3);
        econt.addItem(tv);
        econt.addItem(addidas);
        System.out.println();
        
        System.out.println("Total income of the courier company is: " + econt.total_income());
        
    }
    
}
