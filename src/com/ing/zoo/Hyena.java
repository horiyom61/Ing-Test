package com.ing.zoo;

import Interface.Carnivore;
import Interface.TrickPerformer;

import java.util.Random;

/**
 * De Hyena-klasse stelt een dier voor dat vlees eet en trucjes kan doen.
 * Deze klasse erft van Animal en implementeert Carnivore en TrickPerformer.
 */
public class Hyena extends Animal implements Carnivore, TrickPerformer {

    /**
     * Constructor: naam van de hyena wordt doorgegeven aan de superklasse.
     */
    public Hyena(String name) {
        super(name);
    }

    /**
     * Laat de hyena hallo zeggen met een typisch hyenageluid.
     */
    @Override
    public void sayHello() {
        // Teksten voor geluiden, eetgedrag en trucjes
        String helloText = "yi-yi-yi-yi!";
        System.out.println(helloText);
    }

    /**
     * Laat de hyena vlees eten.
     */
    @Override
    public void eatMeat() {
        String eatText = "nomnomnom thx hahahahaha";
        System.out.println(eatText);
    }

    /**
     * Laat de hyena een willekeurige truc uitvoeren.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if (rnd == 0) {
            trick = "runs in circles";
        } else {
            trick = "runs toward the camera";
        }
        System.out.println(trick);
    }
}

