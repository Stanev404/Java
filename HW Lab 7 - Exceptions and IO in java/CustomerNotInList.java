/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class CustomerNotInList extends Exception{
    private String company_name;
    
    public CustomerNotInList(String message, Company customer) {
    super(message);
    this.company_name = customer.getName_of_company();
    }
    
    @Override
    public String toString(){
        
        return super.getMessage() + this.company_name;
        
    }
    
}
