
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Invoice {
    private static int serial_number_of_invoice = 0;
    private final int actual_serial_number_of_invoice;
    private final Company provider;
    private final Company reciever;
    private final String date_of_issue;
    private final Goods selling_good;
    private final int quantity_of_good;

    public Invoice(Company provider, Company reciever, String date_of_issue, Goods selling_good, int quantity_of_good) {
        this.actual_serial_number_of_invoice = ++serial_number_of_invoice;
        this.provider = provider;
        this.reciever = reciever;
        this.date_of_issue = date_of_issue;
        this.selling_good = selling_good;
        this.quantity_of_good = quantity_of_good;
    }

    @Override
    public String toString(){
        return "Serial number of invoice: " + this.actual_serial_number_of_invoice + System.lineSeparator() + "Date of issue: " + this.date_of_issue + System.lineSeparator() + "Company provider: { " + this.provider + " }" + System.lineSeparator() + "Company reciever: { " + this.reciever + " }" + System.lineSeparator()
                + "Selling good: { " + this.selling_good + " }"  + System.lineSeparator() + "Quantity of good: " + this.quantity_of_good + System.lineSeparator() + "Final price: " + this.selling_good.final_price()*this.quantity_of_good;
    }

    public String getActual_serial_number_of_invoice() {
        String res = "";
        res+=this.actual_serial_number_of_invoice;
        return res;
    }

    public static void readInvoiceFromFile(String path){
        int c;
        try(FileReader fr = new FileReader(path)){
               while((c=fr.read())!=-1)System.out.print((char)c);
               System.out.println();
            }
        catch(IOException e){
            System.out.println(e);
        }
        }
    
    public Company getProvider() {
        return provider;
    }

    public Company getReciever() {
        return reciever;
    }

    public String getDate_of_issue() {
        return date_of_issue;
    }

    public Goods getSelling_good() {
        return selling_good;
    }

    public int getQuantity_of_good() {
        return quantity_of_good;
    }
    
    
    
    double total_value(){
        double sum = 0;
        for(int i = 0;i<this.quantity_of_good;i++){
            sum+= this.selling_good.final_price();
        }
        return sum;
    }

    
}
