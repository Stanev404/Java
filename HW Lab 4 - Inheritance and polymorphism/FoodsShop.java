class FoodsShop extends Shop {

    private Food [] foods;
    int current_foods;
    
    FoodsShop(int max_foods) {
        super(max_foods);
        foods = new Food[max_foods];
        this.current_foods = 0;
    }

    void addFood(Food added) {
        if(this.current_foods < this.foods.length){
            this.foods[this.current_foods] = added;
            this.current_foods++;
            return;
        }
        System.out.println("Food Shop is full !");
    }

    @Override
    double totalRevenue() {
        double total_value = 0;
        for(int i = 0;i<this.current_foods;i++){
            total_value+=this.foods[i].price();
        }
        return total_value;
    }

    @Override
    void print() {
        for(int i = 0;i<this.current_foods;i++){
            foods[i].print();
        }
    }
}
