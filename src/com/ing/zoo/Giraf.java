package com.ing.zoo;

import Interface.Herbivore;

/**
 * De Giraf-klasse stelt een herbivoor dier voor.
 * Deze klasse erft van Animal en implementeert het gedrag van een planteneter.
 */
public class Giraf extends Animal implements Herbivore {

    /**
     * Constructor: geeft de naam van de giraf door aan de Animal-superklasse.
     */
    public Giraf(String name) {
        super(name);
    }

    /**
     * Geeft een geluid dat een giraf maakt als begroeting.
     */
    @Override
    public void sayHello() {
        // Teksten voor begroeting en eten
        String helloText = "Zoem";
        System.out.println(helloText);
    }

    /**
     * Laat de giraf bladeren eten.
     */
    @Override
    public void eatLeaves() {
        String eatText = "Munch munch lovely";
        System.out.println(eatText);
    }
}
