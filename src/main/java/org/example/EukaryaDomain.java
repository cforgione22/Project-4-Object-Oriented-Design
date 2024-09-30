package org.example;

/**
 * EukaryaDomain is an abstract class that has most of the date fields and methods needed for this program. The data fields are  created and used for storage
 * for this program to run successfully.
 */

public abstract class EukaryaDomain {

    private String className;
    private String orderName;
    private String familyName;
    private String genusName;
    private String speciesName;
    private String organismName;
    private boolean extinct;

    public EukaryaDomain(String className , String orderName, String familyName, String genusName, String speciesName, String organismName, boolean extinct)
    {
        this.className = className;
        this.orderName = orderName;
        this.familyName = familyName;
        this.genusName = genusName;
        this.speciesName = speciesName;
        this.organismName = organismName;
        this.extinct = extinct;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getOrganismName() {
        return organismName;
    }

    public void setOrganismName(String organismName) {
        this.organismName = organismName;
    }

    public boolean isExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    /**
     * This method is created to change the boolean from displaying "true" or "false" , to "yes" or "no" to the user.
     */
    @Override
    public String toString() {
        return "Class name: " + getClassName() +
                "\nOrder name: " + getOrderName() +
                "\nFamily name: " + getFamilyName() +
                "\nGenus name: " + getGenusName() +
                "\nSpecies name: " + getOrganismName() +
                "\nExtinct: " + (extinct ? "Yes" : "No");
    }
}
