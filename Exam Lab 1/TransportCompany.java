/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class TransportCompany extends Company {
    int sold_tickets;
    double price_of_ticket;
    TransportCompany(){
        System.out.println("Default Constructor called.");
    }
    TransportCompany(String name,String address,double starting_capital,int sold_tickets,double price_of_ticket){
        super(name,address,starting_capital);
        this.sold_tickets = sold_tickets;
        this.price_of_ticket = price_of_ticket;
        System.out.println("Constructor-TransportCompany called.");
    }
    @Override
    double income(){
        return this.sold_tickets * this.price_of_ticket;
    }
    
    @Override
    double netIncome(){
        double res = income() * (Company.percent/100);
        
        return this.income() - res;
    }
    
    @Override
    void printData(){
        super.printData();
        System.out.println("Sold tickets: " + this.sold_tickets);
        System.out.println("Price of a ticket: " + this.price_of_ticket);
    } 
    
}
