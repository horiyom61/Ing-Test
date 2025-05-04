package com.ing.zoo;

import Interface.Herbivore;

/**
 * De Zebra-klasse stelt een planteneter voor.
 * Deze klasse erft van Animal en implementeert Herbivore.
 */
public class Zebra extends Animal implements Herbivore {
    // Geluidsteksten
    private String helloText;
    private String eatText;

    /**
     * Constructor: geeft de naam van de zebra door aan de superklasse Animal.
     *
     * @param name Naam van de zebra
     */
    public Zebra(String name) {
        super(name);
    }

    /**
     * Laat de zebra hallo zeggen.
     */
    @Override
    public void sayHello() {
        helloText = "neighhh";
        System.out.println(helloText);
    }

    /**
     * Laat de zebra bladeren eten.
     */
    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}

