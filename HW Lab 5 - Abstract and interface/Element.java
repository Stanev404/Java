class Element {

    private double weight;

    private Material mat;

    Element(double weight, Material mat) {
        this.weight = weight;
        this.mat = mat;
    }

    boolean is_it_breakable() {
        return this.mat.isBreakable();
    }
    
    double get_weight(){
        return this.weight;
    }
    
    

    public String toString() {
            return "Weight: " + this.weight + "\n" + "And its material: " + this.mat.toString();
        
    }
}
