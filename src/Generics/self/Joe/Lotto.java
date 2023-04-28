package Generics.self.Joe;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Lotto {

    public static void main(String[] args) {
        // HashSet für bereits gezogene Zahlen
        Set<Integer> bereitsGezogen = new HashSet<>();

        // Schleife zum Ziehen von 6 Zahlen
        Random random = new Random();
        while (bereitsGezogen.size() < 6) {
            int zahl = random.nextInt(49) + 1;

            // Überprüfe, ob diese Zahl bereits gezogen wurde
            if (bereitsGezogen.contains(zahl)) {
                continue;
            }

            // Füge die gezogene Zahl zum HashSet der bereits gezogenen Zahlen hinzu
            bereitsGezogen.add(zahl);
        }

        // Sortiere die gezogenen Zahlen aufsteigend
        ArrayList<Integer> gezogeneZahlen = new ArrayList<>(bereitsGezogen);
        Collections.sort(gezogeneZahlen);

        // Gib die gezogenen Zahlen aus
        System.out.print("Die gezogenen Lottozahlen sind: ");
        for (int zahl : gezogeneZahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println();
    }
}