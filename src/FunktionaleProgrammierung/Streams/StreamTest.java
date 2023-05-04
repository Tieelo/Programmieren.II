package FunktionaleProgrammierung.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<Artikel> list = new ArrayList<Artikel>();
		list.add(new Artikel(4712, 'A', 12.));
		list.add(new Artikel(4714, 'A', 20.));
		list.add(new Artikel(4713, 'B', 10.));
		list.add(new Artikel(4715, 'B', 10.));
		list.add(new Artikel(4711, 'A', 10.));

		// Sortieren und ausgeben
		list.stream().sorted((a, b) -> a.getId() - b.getId())
				.forEach(System.out::println);

		// Filtern und zählen
		long count = list.stream().filter(a -> a.getTyp() == 'A')
				.count();
		System.out.println(count);

		// Filtern und Ergebnis als Liste erzeugen
		List<Artikel> filtered = list.stream().filter(a -> a.getTyp() == 'A')
				.collect(Collectors.toList());

		// Map und reduce
		double z = filtered.stream().map(Artikel::getPreis)
				.reduce(0., (x, y) -> x + y) / filtered.size();
		System.out.println("Durchschnittspreis für Artikel vom Typ A: " + z);
	}
}