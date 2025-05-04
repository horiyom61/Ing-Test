package com.ing.zoo;

import Interface.Carnivore;

/**
 * De Lion-klasse stelt een vleesetend dier voor.
 * Deze klasse erft van Animal en implementeert Carnivore.
 */
public class Lion extends Animal implements Carnivore {

    /**
     * Constructor: geeft de naam van de leeuw door aan de superklasse Animal.
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * Laat de leeuw hallo zeggen.
     */
    @Override
    public void sayHello() {
        // Geluidsteksten
        String helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    /**
     * Laat de leeuw vlees eten.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}

