package org.example;

public class PlantaeKingdom extends EukaryaDomain {

    private String division;

    public PlantaeKingdom(String division, String className , String orderName, String familyName, String genusName, String speciesName, String organismName, boolean extinct) {
        super(className, orderName, familyName, genusName, speciesName, organismName, extinct);
        this.division = division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDivision() {
        return division;
    }
}

