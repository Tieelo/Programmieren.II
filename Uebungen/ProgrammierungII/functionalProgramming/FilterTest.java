package ProgrammierungII.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
		System.out.println("Originale Liste: ");
		list.forEach(System.out::println);

        Predicate<Integer> kriterium =  n -> n % 2 == 0;
        List<Integer> newList = list.stream().filter(kriterium).toList();

        // Was fällt beim Ergebnis auf? Wo liegt der Fehler?
		System.out.println("Gefiltert: ");
		newList.forEach(System.out::println);

		// auch moeglich:
		// list.removeIf(kriterium);
	}

}