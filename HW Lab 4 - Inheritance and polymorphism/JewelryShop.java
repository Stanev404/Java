class JewelryShop extends Shop {

    private Jewel [] jewellery;
    int current_jewellery;
    
    JewelryShop(int max_jewellery) {
        super(max_jewellery);
        this.jewellery = new Jewel[max_jewellery];
        this.current_jewellery = 0;
    }

    void addJewelry(Jewel added) {
        if(this.current_jewellery < this.jewellery.length){
            this.jewellery[this.current_jewellery] = added;
            this.current_jewellery++;
            return;
        }
        System.out.println("Jewelry Shop is full !");
    }

    @Override
    double totalRevenue() {
        double total_value = 0;
        for(int i = 0;i<this.current_jewellery;i++){
            total_value +=  this.jewellery[i].price();
        }
        return total_value;
    }

    @Override
    void print() {
        for(int i = 0;i<this.current_jewellery;i++){
            this.jewellery[i].print();
        }
     }
}
