package ProgrammierungII.Nachklausur_PII;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListFilter {
    public static void main(String[] args) {
		List<String> list = Arrays.asList("Zeit", "Raum", "Temperatur", "Spannung", "Energie");
		
		System.out.println("Originale Liste: ");
		list.forEach(System.out::println);

        Predicate<String> kriterium =  wort -> wort.contains("e");
        List<String> newList = list.stream().filter(kriterium).toList();

        // Was fällt beim Ergebnis auf? Wo liegt der Fehler?
		System.out.println("Gefilterte Liste: ");
		newList.forEach(System.out::println);
	}
}
