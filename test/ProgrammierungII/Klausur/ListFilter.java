package ProgrammierungII.Klausur;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListFilter {
    public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(24, 15, 3, 66, 81, 3, 5));
		
		System.out.println("Originale Liste: ");
		list.forEach(System.out::println);

        Predicate<Integer> kriterium =  n -> n > 10;
        List<Integer> newList = list.stream().filter(kriterium).toList();

        // Was fällt beim Ergebnis auf? Wo liegt der Fehler?
		System.out.println("Gefilterte Liste: ");
		newList.forEach(System.out::println);
	}
}
