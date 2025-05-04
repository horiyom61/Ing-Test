package com.ing.zoo;

// Interfaces importeren voor gedragskenmerken van dieren
import Interface.Carnivore;
import Interface.Herbivore;
import Interface.TrickPerformer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        // Lijst om alle dieren in de dierentuin op te slaan
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));
        animals.add(new Giraf("melman"));
        animals.add(new Hyena("billy"));

        Scanner scanner = new Scanner(System.in);

        // Gebruiker informeren over beschikbare commando's
        System.out.println("Mogelijke commands:");
        System.out.println(" - hello            → Alle dieren zeggen hallo");
        System.out.println(" - hello [naam]     → Eén dier zegt hallo");
        System.out.println(" - give meat        → Carnivoren krijgen vlees");
        System.out.println(" - give leaves      → Herbivoren krijgen bladeren");
        System.out.println(" - perform trick    → Dieren die een truc kunnen doen voeren die uit");
        System.out.println(" - exit             → Programma afsluiten");

        // Command loop blijft actief totdat gebruiker 'exit' typt
        while (true) {
            System.out.print("\nVoer uw command in: ");
            String input = scanner.nextLine().trim().toLowerCase();

            // Programma afsluiten
            if (input.equals("exit")) {
                System.out.println("Programma afgesloten.");
                break;
            }

            // Alle dieren zeggen hallo
            if (input.equals("hello")) {
                for (Animal a : animals) {
                    a.sayHello();
                }

                // Specifiek dier zegt hallo (op naam)
            } else if (input.startsWith("hello ")) {
                String getName = input.substring(6);
                boolean found = false;

                // Zoek naar dier met overeenkomstige naam
                for (Animal a : animals) {
                    if (a.getName().equalsIgnoreCase(getName)) {
                        a.sayHello();
                        found = true;
                    }
                }

                // Geen dier gevonden met opgegeven naam
                if (!found) {
                    System.out.println("Geen dier gevonden met de naam: " + getName);
                }

                // Alleen carnivoren krijgen vlees
            } else if (input.equals("give meat")) {
                for (Animal a : animals) {
                    if (a instanceof Carnivore) {
                        ((Carnivore) a).eatMeat();
                    }
                }

                // Alleen herbivoren krijgen bladeren
            } else if (input.equals("give leaves")) {
                for (Animal a : animals) {
                    if (a instanceof Herbivore) {
                        ((Herbivore) a).eatLeaves();
                    }
                }

                // Alleen dieren die trucjes kunnen voeren uit
            } else if (input.equals("perform trick")) {
                for (Animal a : animals) {
                    if (a instanceof TrickPerformer) {
                        ((TrickPerformer) a).performTrick();
                    }
                }

                // Onbekend command
            } else {
                System.out.println("Onbekend command: " + input);
            }
        }
    }
}


