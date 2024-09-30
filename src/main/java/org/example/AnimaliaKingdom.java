package org.example;

public class AnimaliaKingdom extends EukaryaDomain {

    private String phylum;

    public AnimaliaKingdom(String phylum, String className , String orderName, String familyName, String genusName, String speciesName, String organismName, boolean extinct) {
        super(className, orderName, familyName, genusName, speciesName, organismName, extinct);
        this.phylum = phylum;
    }


    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getPhylum() {
        return phylum;
    }

}