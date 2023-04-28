package Generics.self.Joe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {

    public static void main(String[] args) {
        // Erstelle eine Liste von Strings
        List<String> strings = new ArrayList<>();
        strings.add("Banane");
        strings.add("Apfel");
        strings.add("Erdbeere");
        strings.add("Zitrone");
        strings.add("Mango");

        // Sortiere die Elemente nach Alphabet
        Collections.sort(strings);

        // Gib das sortierte Ergebnis aus
        System.out.println("Sortierung nach Alphabet:");
        for (String string : strings) {
            System.out.println(string);
        }

        // Sortiere die Elemente nach Zeichenketten-Länge
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        // Gib das sortierte Ergebnis aus
        System.out.println("Sortierung nach Zeichenketten-Länge:");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
