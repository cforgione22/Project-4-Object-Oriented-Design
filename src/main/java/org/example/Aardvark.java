package org.example;

public class Aardvark extends AnimaliaKingdom {

    private String habitat;

    public Aardvark(String habitat, String phylum, String className , String orderName, String familyName, String genusName, String speciesName, String organismName, boolean extinct) {
        super(phylum, className, orderName, familyName, genusName, speciesName, organismName, extinct);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Phylum: " + getPhylum() +
                "Class name: " + getClassName() +
                "Order name: " + getOrderName() +
                "Family name: " + getFamilyName() +
                "Genus name: " + getGenusName() +
                "Species name " + getOrganismName() +
                "Extinct: " + isExtinct() +
                "Habitat: " + habitat;
    }
}