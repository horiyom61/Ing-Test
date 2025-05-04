package com.ing.zoo;

import Interface.Carnivore;
import Interface.Herbivore;
import Interface.TrickPerformer;

import java.util.Random;

/**
 * De Pig-klasse stelt een dier voor dat zowel planten als vlees eet
 * én trucjes kan uitvoeren. Deze klasse erft van Animal.
 */
public class Pig extends Animal implements Herbivore, Carnivore, TrickPerformer {

    /**
     * Constructor: geeft de naam van het varken door aan de superklasse.
     */
    public Pig(String name) {
        super(name);
    }

    /**
     * Laat het varken hallo zeggen.
     */
    @Override
    public void sayHello() {
        // Teksten voor begroeting, eten en trucjes
        String helloText = "knork knork";
        System.out.println(helloText);
    }

    /**
     * Laat het varken bladeren eten.
     */
    @Override
    public void eatLeaves() {
        String eatText = "munch munch oink";
        System.out.println(eatText);
    }

    /**
     * Laat het varken vlees eten.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    /**
     * Laat het varken een willekeurig trucje doen.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}

