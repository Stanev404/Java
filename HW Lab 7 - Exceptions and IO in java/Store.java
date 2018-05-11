/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Lenovo
 */
public class Store {
    private Goods good;
    private int quantity_of_good;
    private Company owner_company;
    private Company[] customers;

    public Store(Goods good, int quantity_of_good, Company owner_company, Company[] customers) {
        this.good = good;
        this.quantity_of_good = quantity_of_good;
        this.owner_company = owner_company;
        this.customers = customers;
    }

    void delivery(int quantity){
        this.quantity_of_good += quantity;
    }
        
    void sell(int quantity, Company reciever) throws InsufficientQuatityOfGoodsException, CustomerNotInList{
        if(quantity>this.quantity_of_good) throw new InsufficientQuatityOfGoodsException("Quantity over the maximum treshold: ",quantity-this.quantity_of_good);
        else{
            this.quantity_of_good-=quantity;
            if(checkInList(reciever)){ // proveriavame dali klienta e ot spisaka
            String curr_date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            
            Invoice curr_invoice = new Invoice(this.owner_company,reciever,curr_date,this.good,quantity);
            
            SaveInvoiceToFile(curr_invoice);
                
            }
            else throw new CustomerNotInList("Customer not in list: ",reciever);
                
        }
    }
    
    void SaveInvoiceToFile(Invoice curr_invoice){
        String invoice_id = "Invoice-" + curr_invoice.getActual_serial_number_of_invoice() + ".txt";
        try(FileWriter f = new FileWriter(invoice_id)){
            f.write(curr_invoice.toString()); 
            
        }
        catch(IOException e){
            System.out.println(e+"Cant open file to write.");
        }
    }
    
    boolean checkInList(Company reciever){
        for (Company i:this.customers){
            if(i.equals(reciever)){
                return true;
            }
        }
        return false;
    }
    
    void makeInvoice(int quantity){
        
    }

    
    

}
