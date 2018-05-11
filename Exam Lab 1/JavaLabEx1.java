/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
public class JavaLabEx1 {

    /**
     * @param args the command line arguments
     * ToyFactory(String name,String address,double starting_capital,int max_toys,int curr_toys,double no_sell_price_of_toy,double sell_price_of_toy){
     */
    public static void main(String[] args) {
        Company lego = new ToyFactory("Lego","Street oregon",250,20,4,8.50,10); // 34 40
        lego.printData();
        Company econt = new TransportCompany("Econt","Ulica Ivan Vazov",500,20,4);
        System.out.println(econt.netIncome());
        
        econt.printData();
    }
    
}
