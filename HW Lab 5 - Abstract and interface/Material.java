class Material {

    private String name_of_material;

    private boolean isBreakable;

    Material(String name_of_material, boolean isBreakable) {
        this.name_of_material = name_of_material;
        this.isBreakable = isBreakable;
    }   
    
    boolean isBreakable(){
        return this.isBreakable;
    }
    
    public String toString() {
        if(this.isBreakable == true){
            return this.name_of_material + " is breakable";
        }
        return this.name_of_material + " is not breakable";
    }
}
