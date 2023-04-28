package FunktionaleProgrammierung.LambdaAusdruecke.Uebung;
import java.util.*;

public class Komparator {
    public static void main(String[] args) {
        String[] strings = { "Werkstoffkunde", "WiIng", "Germanistik", "TierGenetik", "Physik", "Altorientalistik" };

        // Sortieren nach Alphabet
        Arrays.sort(strings, Comparator.naturalOrder());

        // Sortieren nach Länge
        Arrays.sort(strings, Comparator.comparing(String::length));

        // Sortieren nach der Anzahl des Buchstabens 'e'
        Arrays.sort(strings, Comparator.comparing(str -> countChar(str, 'e')));

        // Ausgabe des sortierten Arrays
        System.out.println(Arrays.toString(strings));
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