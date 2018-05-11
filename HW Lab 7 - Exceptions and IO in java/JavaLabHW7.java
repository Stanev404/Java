
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
public class JavaLabHW7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Goods kivy = new Goods("Kivy",7.0,20);
        
        Company metro = new Company("Metro",77659);
        Company billa = new Company("Billa",60145);
        
        Company fantastiko = new Company("Fantastiko",33345);

        Company [] customers = new Company[2];
        customers[0] = billa;
        customers[1] = fantastiko;
        
        Invoice faktura_1 = new Invoice(metro,billa,"05.03.2018",kivy,5); // invoice number 1
        //double total_price = faktura_1.total_value();
        //System.out.println("Total price: " + total_price);
        
      
        Store sklad = new Store(kivy,15,metro,customers);
        try{
        sklad.sell(14, billa); // invoice number 2
                
                Invoice.readInvoiceFromFile("Invoice-2.txt"); 

        sklad.delivery(13); 
        sklad.sell(9, metro);
        }
        catch(InsufficientQuatityOfGoodsException | CustomerNotInList e){
            System.out.println(e);
        }
        
        //serialization and deserialization

        Goods apple = new Goods("Apple",5,20);
        
            try (FileOutputStream fos = new FileOutputStream("apple.ser"); ObjectOutputStream outputStream = new ObjectOutputStream(fos)) {
                
                outputStream.writeObject(apple);
                
                
                //deserialization
                FileInputStream fin = new FileInputStream("apple.ser");
                ObjectInputStream ois = new ObjectInputStream(fin);
                
                Goods read_good = (Goods) ois.readObject();
                System.out.println(read_good);
                
                ois.close();
                fin.close();
                    } 
        catch (IOException ex) {
        System.err.println("IOException is caught." + ex);
        }
        catch(ClassNotFoundException ex){
            System.err.println("Class not found exception." + ex);
        }

        
        
    }
    
}
