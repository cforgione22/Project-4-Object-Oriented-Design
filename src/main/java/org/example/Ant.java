package org.example;

public class Ant extends AnimaliaKingdom {

    private String casteMembership;

    public Ant(String casteMembership, String phylum, String className , String orderName, String familyName, String genusName, String speciesName, String organismName, boolean extinct) {
        super(phylum, className, orderName, familyName, genusName, speciesName, organismName, extinct);
        this.casteMembership = casteMembership;
    }

    public String getCasteMembership() {
        return casteMembership;
    }

    public void setCasteMembership(String casteMembership) {
        this.casteMembership = casteMembership;
    }

    @Override
    public String toString() {
        return "Cast membership: " + casteMembership +
                "Phylum: " + getPhylum() +
                "Class name: " + getClassName() +
                "Order name: " + getOrderName() +
                "Family name: " + getFamilyName() +
                "Genus name: " + getGenusName() +
                "Species name " + getOrganismName() +
                "Extinct: " + isExtinct() +
                "Cast membership: " + casteMembership;
    }
}