package org.example;

public class EukaryaDomain {

    private String className;
    private String orderName;
    private String familyName;
    private String genusName;
    private String speciesName;
    private String organismName;
    private boolean extinct;

    public EukaryaDomain(String mammalia , String carnivora, String canidae, String canis, String canisLupus, String wolf, boolean isExstinct)
    {
        className = mammalia;
        orderName = carnivora;
        familyName = canidae;
        genusName= canis;
        speciesName = canisLupus;
        organismName = wolf;
        extinct = isExstinct;

    }

}
