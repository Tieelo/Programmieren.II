package ProgrammierungII.Generics.Container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnterschiedlichSortieren {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apfel", "Zeit", "Mut", "Schnittstelle", "Kater", "Yak", "Beet", "Anzug", "Ei");

        int n = list.size();

        list.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Lambda: nach Laenge: " + list);
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Lambda: nach Alphabet: " + list);

        System.out.println("klassisch nach Alphabet");
        for (int i = 0; i < n; i++) {  
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).compareTo(list.get(i)) < 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);

        System.out.println("klassisch nach Länge");
        for (int i = 0; i < n; i++) {  
            for (int j = i + 1; j < n; j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
