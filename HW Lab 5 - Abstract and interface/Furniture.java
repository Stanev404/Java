class Furniture extends Item {

    private String marka;

    Furniture(String marka, Box given_box, String address, double price_per_kg, int num_of_elements) {
        super(given_box,address,price_per_kg,num_of_elements);
        this.marka = marka;
    
    }

    @Override
    public double shippingPrice() {
        double prev = super.overall_weight() * super.price_per_kg;
        if(this.isBroken()){
            prev = prev * 1.5/100;
            return super.overall_weight() * super.price_per_kg + prev;
        }
        return prev;
    }

    boolean isBroken() {
        boolean flag = false;
        for(int i = 0;i<this.curr_pos;i++){
            if(this.item_elements[i].is_it_breakable()){
                 flag = true;
                 break;
            }
}
        return flag; // test
    }

    double overall_weight() {
        return  super.overall_weight();
    }
    
   
}
