package org.example;


/**
 *  Ant is the subclass of AnimaliaKingdom. This is where the toString for Ant is created and
 *  where the data field casteMembership is stored.
 *
 */

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
        return super.toString() + "\nCast membership: " + casteMembership;
    }

}
