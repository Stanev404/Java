
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
public class Hotel implements Serializable {

    private String name;
    private String address;
    private boolean hasSwimmingPool;
    private String category;
    private boolean hasParking;
    private boolean hasAnimators;
    private boolean hasFitnes;
    private boolean hasSauna;

    public Hotel() {
    }
public Hotel(String name, String address, boolean hasSwimmingPool, String category, boolean hasParking, boolean hasAnimators, boolean hasFitnes, boolean hasSauna) {
        this.name = name;
        this.address = address;
        this.hasSwimmingPool = hasSwimmingPool;
        this.category = category;
        this.hasParking = hasParking;
        this.hasAnimators = hasAnimators;
        this.hasFitnes = hasFitnes;
        this.hasSauna = hasSauna;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", address=" + address + ",\n hasSwimmingPool=" + hasSwimmingPool + ", category=" + category + ",\n hasParking=" + hasParking + ", hasAnimators=" + hasAnimators + ",\n hasFitnes=" + hasFitnes + ", hasSauna=" + hasSauna + '}';
}
}