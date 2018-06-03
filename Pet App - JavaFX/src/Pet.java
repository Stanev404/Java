/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;

/**
 *
 * @author Kostadinova
 */
/**
 *
 * @author Kostadinova
 */
public class Pet {

    private String name;
    private LocalDate dateOfBirth;
    private boolean isMale;
    private boolean kind;
    private String breed;
    private boolean longCoat;
    private boolean aggressive;
    private boolean appropriateForKids;

    public Pet() {
    }

    public Pet(String name, LocalDate dateOfBirth, boolean isMale, boolean kind, String breed, boolean longCoat, boolean aggressive, boolean appropriateForKids) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.isMale = isMale;
        this.kind = kind;
        this.breed = breed;
        this.longCoat = longCoat;
        this.aggressive = aggressive;
        this.appropriateForKids = appropriateForKids;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public boolean isKind() {
        return kind;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isLongCoat() {
        return longCoat;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public boolean isAppropriateForKids() {
        return appropriateForKids;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setKind(boolean kind) {
        this.kind = kind;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLongCoat(boolean longCoat) {
        this.longCoat = longCoat;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    public void setAppropriateForKids(boolean appropriateForKids) {
        this.appropriateForKids = appropriateForKids;
    }

    
    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", dateOfBirth=" + dateOfBirth +  ", isMale=" + isMale + ", kind=" + kind + ", breed=" + breed + ", longCoat=" + longCoat + ", aggressive=" + aggressive + ", appropriateForKids=" + appropriateForKids + '}';
    }

}
