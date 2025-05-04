package com.ing.zoo;

/**
 * Abstracte klasse voor alle dieren in de dierentuin.
 * Bevat een naam en verplicht afgeleide klassen om een begroeting te implementeren.
 */
public abstract class Animal {
    // Naam van het dier
    protected String name;

    // Constructor om de naam van het dier in te stellen
    public Animal(String name) {
        this.name = name;
    }

    // Getter voor de naam van het dier
    public String getName() {
        return name;
    }

    // Abstracte methode die elk dier op zijn eigen manier moet implementeren
    public abstract void sayHello();
}
