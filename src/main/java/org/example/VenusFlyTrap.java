package org.example;

/**
 *  VenusFlyTrap is the subclass of PlantaeKingdom. This is where the toString for Venus Fly Tra is created and
 *  where the data field trapSize is stored.
 *
 */

public class VenusFlyTrap extends PlantaeKingdom {

    private double trapSize;

    public VenusFlyTrap(double trapSize, String division, String className , String orderName, String familyName, String genusName, String speciesName, String organismName, boolean extinct) {
        super(division, className, orderName, familyName, genusName, speciesName, organismName, extinct);
        this.trapSize = trapSize;
    }

    public double getTrapSize() {
        return trapSize;
    }

    public void setTrapSize(double trapSize) {
        this.trapSize = trapSize;
    }

    @Override
    public String toString() {
        return  "Division: " + getDivision() +
                "\nClass name: " + getClassName() +
                "\nOrder name: " + getOrderName() +
                "\nFamily name: " + getFamilyName() +
                "\nGenus name: " + getGenusName() +
                "\nSpecies name: " + getOrganismName() +
                "\nTrap size: " + trapSize + " inches";

    }

}