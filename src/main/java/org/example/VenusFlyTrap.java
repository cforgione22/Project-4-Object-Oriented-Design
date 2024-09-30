package org.example;

public class VenusFlyTrap extends PlantaeKingdom {

    private String trapSize;

    public VenusFlyTrap(String trapSizeString, String division, String className , String orderName, String familyName, String genusName, String speciesName, String organismName, boolean extinct) {
        super(division, className, orderName, familyName, genusName, speciesName, organismName, extinct);
        this.trapSize = trapSize;
    }

    public String getTrapSize() {
        return trapSize;
    }

    public void setTrapSize(String trapSize) {
        this.trapSize = trapSize;
    }

    @Override
    public String toString() {
        return "Division: " + getDivision() +
                "Class name: " + getClassName() +
                "Order name: " + getOrderName() +
                "Family name: " + getFamilyName() +
                "Genus name: " + getGenusName() +
                "Species name " + getOrganismName() +
                "Extinct: " + isExtinct() +
                "Trap size: " + trapSize;
    }

}