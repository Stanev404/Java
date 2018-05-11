/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Company {
    private String name_of_company;
    private int identification_number;
    
    Company(){};

    public Company(String name_of_company, int identification_number) {
        this.name_of_company = name_of_company;
        this.identification_number = identification_number;
    }

    public String getName_of_company() {
        return name_of_company;
    }

    public int getIdentification_number() {
        return identification_number;
    }
    @Override
    public String toString(){
        return "Name of company: " + this.name_of_company + System.lineSeparator() + "Identification number: " + this.identification_number;
    }
    
    boolean equals(Company two){
        return this.name_of_company.equals(two.getName_of_company())&& this.identification_number == two.getIdentification_number();
    }
    
}
