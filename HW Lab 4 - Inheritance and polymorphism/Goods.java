class Goods {

    private String name_of_good;

    private double price_without_overcharge;

    private double overcharge_percent;

    Goods(String name, double price_without_overcharge, double overcharge_percent) {
        this.name_of_good = name;
        this.price_without_overcharge = price_without_overcharge;
        this.overcharge_percent = overcharge_percent;
        
    }

    double price() {
        double percent_value = this.price_without_overcharge * this.overcharge_percent/100;
        
        return this.price_without_overcharge + percent_value;
    }

    void print() {
        System.out.println("Name of good: " + this.name_of_good + "\n" + "Price Without Overcharge: " + this.price_without_overcharge + "\n" + "Overcharge percentage: " + this.overcharge_percent);
        
    }
}
