class Shoes extends Item{

    private boolean budat_premereni;

    Shoes(boolean budat_premereni, Box given_box, String address, double price_per_kg, int num_of_elements) {
        super(given_box,address,price_per_kg,num_of_elements);
        this.budat_premereni = budat_premereni;
    }

    @Override
    public double shippingPrice() {
        if(this.budat_premereni){
            double prev = this.price_per_kg * this.overall_weight() * 3/100;
            return prev + this.price_per_kg * this.overall_weight();
        }
        return this.price_per_kg * this.overall_weight();
    }

    @Override
    public String toString() {
        if(this.budat_premereni){
            return "Mogat da se premerqt" + "\n" + super.toString();
        }
        return "Ne mogat da se premerqt" + "\n" + super.toString();
    }
}
