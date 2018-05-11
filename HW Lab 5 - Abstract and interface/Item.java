abstract class Item implements Shipment{

    protected Box given_box;

    protected String delivery_address;

    protected double price_per_kg;

    protected int num_of_elements;

    protected Element [] item_elements;
    
    protected int curr_pos;

    Item(Box given_box, String address, double price_per_kg, int num_of_elements) {
        this.given_box = given_box;
        this.delivery_address = address;
        this.price_per_kg = price_per_kg;
        this.num_of_elements = num_of_elements;
        this.item_elements = new Element[this.num_of_elements];
        this.curr_pos = 0;
    }

    void addElement(Element added) {
        if(this.curr_pos < this.num_of_elements){
            this.item_elements[this.curr_pos] = added;
            this.curr_pos++;
            return;
        }
        System.out.println("Element list is full !");
        
    }

    double overall_weight() {
        double total_weight = 0;
        for(int i = 0;i<this.curr_pos;i++){ // test
            total_weight+= this.item_elements[i].get_weight();
        }
        return total_weight;
    }

    @Override
    public abstract double shippingPrice();

    public String toString() {
        return this.given_box.toString() + "\n" + "Delivery address: " + this.delivery_address + "\n" + "Price per kg: " + this.price_per_kg + "\n" + "Number of Elements: " + this.num_of_elements;
        
    }

    void show_elements() {
        for(int i = 0;i<this.curr_pos;i++){
             System.out.println(this.item_elements[i]);
        }
    }
}
