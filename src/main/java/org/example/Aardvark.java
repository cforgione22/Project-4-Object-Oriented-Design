package org.example;

/**
 *  Aardvark is the subclass of AnimaliaKingdom. This is where the toString for Aardvark is created and
 *  where the data field habit is stored.
 *
 */
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
        return "\nPhylum: " + getPhylum() +
                "\nClass name: " + getClassName() +
                "\nOrder name: " + getOrderName() +
                "\nFamily name: " + getFamilyName() +
                "\nGenus name: " + getGenusName() +
                "\nSpecies name: " + getOrganismName() +
                "\nHabitat: " + habitat;
    }
}