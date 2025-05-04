package com.ing.zoo;

import Interface.Herbivore;

/**
 * De Hippo-klasse stelt een herbivoor dier voor.
 * Deze klasse erft van Animal en implementeert het Herbivore-gedrag.
 */
public class Hippo extends Animal implements Herbivore {

    /**
     * Constructor die de naam van het dier doorgeeft aan de Animal-superklasse.
     */
    public Hippo(String name) {
        super(name);
    }

    /**
     * Laat het dier hallo zeggen op zijn eigen manier.
     */
    @Override
    public void sayHello() {
        // Teksten voor geluiden en eetactie
        String helloText = "splash";
        System.out.println(helloText);
    }

    /**
     * Laat het dier bladeren eten.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch yes please";
        System.out.println(eatText);
    }
}

