package org.example;

public class Main {
    public static void main(String[] args) {
        VenusFlyTrap venusFlyTrap = new VenusFlyTrap("1-2 inches","Tracheophyta (vascular plants)", "Magnoliopsida", "Caryophyllales", "Droseraceae", "Dionaea", "Dionaea muscipula", "Venus Fly Traps", false);
        System.out.println(venusFlyTrap.toString());
        venusFlyTrap.extinction();
        Ant ant = new Ant("worker, soldier, or queen", "Arthropoda", "Insecta", "Hymenoptera", "Formicidae", "Iridomyrmex", "Purpureus", "Ants", false);
        System.out.println(ant.toString());
        ant.extinction();
        Aardvark aardvark = new Aardvark("Sub-Saharan Africa", "Chordata", "Mammalia", "Tubulidentata", "Orycteropodidae", "Orycteropus", "O. afer", "Ardvarks", false);
        System.out.println(aardvark.toString());
        aardvark.extinction();
    }

}
