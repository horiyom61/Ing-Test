package com.ing.zoo;

import Interface.Carnivore;
import Interface.TrickPerformer;

import java.util.Random;

/**
 * De Tiger-klasse stelt een roofdier voor dat vlees eet
 * en ook een trucje kan uitvoeren. Deze klasse erft van Animal.
 */
public class Tiger extends Animal implements Carnivore, TrickPerformer {

    /**
     * Constructor: stelt de naam van de tijger in.
     *
     * @param name Naam van de tijger
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Laat de tijger hallo zeggen.
     */
    @Override
    public void sayHello() {
        // Geluidsteksten en trick-omschrijving
        String helloText = "rraaarww";
        System.out.println(helloText);
    }

    /**
     * Laat de tijger vlees eten.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    /**
     * Laat de tijger een willekeurig trucje uitvoeren.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}

