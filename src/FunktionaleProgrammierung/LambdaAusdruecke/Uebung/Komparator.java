package FunktionaleProgrammierung.LambdaAusdruecke.Uebung;
import java.util.*;

public class Komparator {
    public static void main(String[] args) {
        String[] strings = { "werkstoffkunde", "elektrotechnik", "germanistik", "theaterwissenschaften", "physik", "altorientalistik" };


        // Sortieren nach Länge
        Arrays.sort(strings, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(strings));

        // Sortieren nach Alphabet
        Arrays.sort(strings, Comparator.naturalOrder());
        System.out.println(Arrays.toString(strings));

        // Sortieren nach der Anzahl des Buchstabens 'e'
        Arrays.sort(strings, Comparator.comparing(str -> countChar(str, 'e')));
        System.out.println(Arrays.toString(strings));
        // Ausgabe des sortierten Arrays
       // System.out.println(Arrays.toString(strings));
    }

    // Hilfsmethode, um die Anzahl des Buchstabens 'e' in einem String zu zählen
    private static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}