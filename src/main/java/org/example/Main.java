package org.example;
/**
 *  Driver
 *  Where the toString method is implemented and where the information for the objects get passed.
 */
public class Main {
    public static void main(String[] args) {
        VenusFlyTrap venusFlyTrap = new VenusFlyTrap(1.5,"Tracheophyta (vascular plants)", "Magnoliopsida", "Caryophyllales", "Droseraceae", "Dionaea", "Dionaea muscipula", "Venus Fly Traps", false);
        System.out.println(venusFlyTrap);
        venusFlyTrap.extinction();
        Ant ant = new Ant("worker, soldier, or queen", "Arthropoda", "Insecta", "Hymenoptera", "Formicidae", "Iridomyrmex", "Purpureus", "Ants", false);
        System.out.println(ant);
        ant.extinction();
        Aardvark aardvark = new Aardvark("Sub-Saharan Africa", "Chordata", "Mammalia", "Tubulidentata", "Orycteropodidae", "Orycteropus", "O. afer", "Ardvarks", false);
        System.out.println(aardvark);
        aardvark.extinction();
    }

}
