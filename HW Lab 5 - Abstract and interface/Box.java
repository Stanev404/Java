class Box {

    private double a;

    private double b;

    private double c;

    Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double get_Volume() {
        return this.a*this.b*this.c;
    }
    public String toString(){
        return "Side1 of Box: " + this.a +"\n" + "Side2 of box: " + this.b + "\n" + "Side3 of box: " + this.c;
    }
}
