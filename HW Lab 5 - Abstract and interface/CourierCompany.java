class CourierCompany {

    private int num_of_items;

    private Item [] transported_items;
    
    private int curr_items;

    CourierCompany(int num_of_items) {
        this.num_of_items = num_of_items;
        this.transported_items = new Item[this.num_of_items];
        this.curr_items = 0;
    }

    void addItem(Item added) {
        if(this.curr_items < this.num_of_items){
            this.transported_items[this.curr_items] = added;
            this.curr_items++;
            return;
        }
        System.out.println("Transported List is full!");
    }

    public double total_income() {
        double total_income = 0;
        for(int i = 0;i<this.curr_items;i++){
            System.out.println(i + " is " + this.transported_items[i].getClass().getName());
            System.out.println("And its shipping price is: " + this.transported_items[i].shippingPrice());
            total_income += this.transported_items[i].shippingPrice();
            
        }
        return total_income;
    }

    double total_value() {
        double val = 0;
        for(int i = 0;i<this.curr_items;i++){
            val += this.transported_items[i].given_box.get_Volume();
        }
        return val;
    }

    @Override
    public String toString() {
        return "Number of Items in the company: " + this.num_of_items;
        
    }
}
