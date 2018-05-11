/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
abstract class Company {
  protected String name,address;
  
  protected double starting_capital;
  protected static double percent = 10;
  
  Company(){
  System.out.println("Default constructor called.");
  }
  
  Company(String name,String address,double starting_capital){
      this.name = name;
      this.address = address;
      this.starting_capital = starting_capital;
      System.out.println("Constructor-Company called.");
  }
  
  void increaseFund(double incr){
      this.starting_capital += incr;
  }
  void increaseTax(double incr){
      Company.percent +=incr;
  }
  
  void decreaseTax(double decr){
      Company.percent -= decr;
  }
  
  abstract double income();
  abstract double netIncome();
  
  void printData(){
      System.out.println("Name: " + this.name);
      System.out.println("Address: " + this.address);
      System.out.println("Fund: " + this.starting_capital);
  }
  
}
