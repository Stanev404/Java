class Jewel extends Goods {

    boolean is_gold;

    public Jewel(String name, double price_without_overcharge, double overcharge_percent, boolean is_gold) {
        super(name,price_without_overcharge,overcharge_percent);
        this.is_gold = is_gold;
    }

    @Override
    double price() {
        if(this.is_gold == true){
            double old_price = super.price();
            double new_price = old_price + (old_price*5/100);
            return new_price;
        }
        return super.price();
    }

    @Override
    void print() {
        super.print();
        if(this.is_gold == true){
        System.out.println("It's gold");
        }
        else{
            System.out.println("It's not gold");
        }
    }
}
