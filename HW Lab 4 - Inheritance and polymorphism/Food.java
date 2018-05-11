class Food extends Goods {

    int expiration_date_in_days;

    Food(String name, double price_without_overcharge, double overcharge_percent, int expiration_date_in_days) {
    super(name,price_without_overcharge,overcharge_percent);
    this.expiration_date_in_days = expiration_date_in_days;
    
    }

    @Override
    double price() {
        if(this.expiration_date_in_days <= 5){
            double old_price = super.price();
            double new_price = old_price - (old_price * 20/100);
            
            return new_price;
        }
        return super.price();
    }

    @Override
    void print() {
        super.print();
        System.out.println("Expiration Date in days: " + this.expiration_date_in_days);
    }
}
