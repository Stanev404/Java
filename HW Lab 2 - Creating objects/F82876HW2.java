/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f82876.hw2;
class Building{
    private String address;
    private int floors;
    private double built_up_area;
    private double square_meter_price;
    private static double exchange_rate_euro = 1.955;
    Building(){
        this.address = "No Address"; // default 
        this.floors = 0; // deufalt
        this.built_up_area = this.square_meter_price = 0; // default
        System.out.println("Default constructor called.");
        System.out.println(this.toString());
    }
    Building(String address,int floors,double built_up_area,double square_meter_price){
        this.address = address;
        this.floors = floors;
        this.built_up_area = built_up_area;
        this.square_meter_price = square_meter_price;
        System.out.println("Constructor with parameters called.");
        System.out.println(this.toString());
    }
    public String toString(){
        return "Address: " + this.address + '\n' + "Floors: " + this.floors + '\n' + "Built up area: " + this.built_up_area + '\n' + "Square_meter_price: " + this.square_meter_price;        
    }
    double unfoldedArea(){
        return this.floors * this.built_up_area;
    }
    double price_of_building(){
        return this.unfoldedArea()*this.square_meter_price;
    }
    double increase_price_building(double added){ // може би не е това което искате, но така го разбирам аз 
        return this.price_of_building() + added;
    }
    double is_expensive(Building second){
        return this.price_of_building() > second.price_of_building() ? this.price_of_building() : second.price_of_building();
    }
     double price_of_building_in_euro(){
        double sm_in_euro = this.square_meter_price * Building.exchange_rate_euro; // променяме цената на квадратен метър от лева в евро
        return this.unfoldedArea()*sm_in_euro; // получаване на цена на сграда в евро
        
    }
}
public class F82876HW2 {

    
    public static void main(String[] args) {
        Building house = new Building();
        System.out.println("----------------------------------");
        Building school = new Building("Str. Ivan Vazov",5,50.5,7.3);
        System.out.println("----------------------------------");
        
        double unfolded_area_of_school = school.unfoldedArea();
        System.out.println("Unfolded Area of School: " + unfolded_area_of_school);
        double price_of_school = school.price_of_building();
        System.out.println("The Price of School is: " + price_of_school);
        double increased_school_price = school.increase_price_building(500.5);
        System.out.println("The Price of School after increasement: " + increased_school_price);
        System.out.println("----------------------------------");
        
        Building skyscraper = new Building("Str. Park Evenue ",25,32.2,20.0);
        double expensive_one = school.is_expensive(skyscraper);
        System.out.println("Expensive one: " + expensive_one);
        System.out.println("----------------------------------");
        
       System.out.println("Price of school in euro: " + school.price_of_building_in_euro());
       System.out.println("Price of skyscraper in euro: " + skyscraper.price_of_building_in_euro()); 
    }
    
}
