/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class ToyFactory extends Company {
    int max_toys;
    int curr_toys;
    double no_sell_price_of_toy;
    double sell_price_of_toy;
    double income,outcome; // prihodi razhodi
    ToyFactory(){
    System.out.println("Default Constructor called.");
    }
    
    ToyFactory(String name,String address,double starting_capital,int max_toys,int curr_toys,double no_sell_price_of_toy,double sell_price_of_toy){
    super(name,address,starting_capital);
    this.max_toys = max_toys;
    this.curr_toys = curr_toys;
    this.no_sell_price_of_toy = no_sell_price_of_toy;
    this.sell_price_of_toy = sell_price_of_toy;
    
    this.outcome = this.curr_toys * this.no_sell_price_of_toy; // value of razhodi
    this.income = this.curr_toys * this.sell_price_of_toy;  // value of prihodi
    
    System.out.println("Constructor-ToyFactory called.");
    }
    
    void produce(int made_ones){
        if(this.max_toys > made_ones + this.curr_toys){
            this.curr_toys += made_ones;
            this.outcome += made_ones * this.no_sell_price_of_toy;
            return;
        }
        System.out.println("Can't add: " + made_ones + " toys!");
    }
    void sales(int sold_ones){
        this.curr_toys -= sold_ones;
        this.income += sold_ones * this.sell_price_of_toy;
    }
    @Override
    double income(){ // печалбата без данък печалба
       return this.income - this.outcome;
    }
    
    @Override
    double netIncome(){ // печалба с данък печалба
        
        double res = this.income() * super.percent/100;
        return this.income() - res;
    }
    @Override
    void printData(){
        super.printData();
        System.out.println("Prihodi: " + this.income);
        System.out.println("Razhodi: " + this.outcome);
        System.out.println("Net earnings: " + this.netIncome());
    }
}
