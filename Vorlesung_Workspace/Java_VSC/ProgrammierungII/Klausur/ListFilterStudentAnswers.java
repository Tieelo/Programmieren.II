package ProgrammierungII.Klausur;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFilterStudentAnswers {
    public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(24, 15, 3, 66, 81, 3, 5));

		List<Integer> filteredNekum = list.stream().filter(element -> {
			return element > 10;
		}).collect(Collectors.toList());
		System.out.println("Nekums Liste: ");
		filteredNekum.forEach(System.out::println);

		List<Integer> filteredDidszuweit = list.stream().filter(i -> i > 10).collect(Collectors.toList());
		System.out.println("Didszuweits Liste: ");
		filteredDidszuweit.forEach(System.out::println);

		Stream<Integer> Stream = list.stream(); // Haller
		Predicate<Integer> pre = (a) -> a > 10; // Haller
		Predicate<Integer> greater10 = x -> x > 10; // Wedekind
		Predicate<Integer> pred = a -> a > 10; // Preuß

		List<Integer> filtered = list.stream().filter(a -> (a > 10)).collect(Collectors.toList()); // Schindek
		System.out.println("Schindeks Liste: ");
		filtered.forEach(System.out::println);
		System.out.println("Schindeks Antwort: ");
		list.stream().forEach(string -> System.out.println(string));

		List<Integer> list1 = list.stream().filter(pred).toList();// Krull

		System.out.println("Krulls angedachte Liste: ");
		list1.stream().filter(pred).forEach(System.out::println);

		System.out.println("Preuß' Liste: ");
		list.stream().filter(pred).forEach(System.out::println);

		System.out.println("Hallers Liste: ");
		Stream.filter(pre).forEach(System.out::println);

		System.out.println("Wedekinds Liste: ");
		list.stream().filter(greater10).forEach(System.out::println);
		
		System.out.println("Originale Liste: ");
		list.forEach(System.out::println);
		// list = list.stream().filter(a -> a > 10).toList();
        //List<Integer> gefiltert = list.stream().filter(a -> a > 10); // Pierkes

        // Was fällt beim Ergebnis auf? Wo liegt der Fehler?
		System.out.println("Gefilterte Liste: ");
		list.stream().filter(x -> x > 10).forEach(System.out::println);
	}
}
