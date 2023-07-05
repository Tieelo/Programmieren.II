package FunktionaleProgrammierung.LambdaAusdruecke.Uebung;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static void main(String[] args) {
        String[] strings = {"short", "very very long", "medium", "test", "Mirco", "Hallo"};

        Comparator<String> lengthComparator = (s1, s2) -> s1.length() - s2.length();

        Arrays.sort(strings, lengthComparator);

        System.out.println(Arrays.toString(strings));
    }
}
