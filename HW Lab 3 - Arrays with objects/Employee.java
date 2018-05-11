/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author STAN-PC
 */
public class Employee {
    private String name;
    private int actual_serial_number;
    private static int serial_number = 0;
    private double salary;
 
    Employee(String name){ // 1
        this.name = name;
        this.salary = 0;
        this.actual_serial_number = ++serial_number;
       // System.out.println(this.toString());
    }
    double getSalary() {
        return salary; // 4
    }
    String getName(){
    return this.name;
    }
    void setSalary(double sal){
        this.salary = sal; // 2
    }
    void  increase_salary_by_percent(double percent){
        this.salary += this.salary*(percent/100); // 3
    }
    public String toString(){ // 5
        return "Name: " + this.name + "\n" + "Serial number: " + this.actual_serial_number + "\n" + "Salary: " + this.salary;
    }
   
}

