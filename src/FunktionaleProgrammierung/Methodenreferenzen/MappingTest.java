package FunktionaleProgrammierung.Methodenreferenzen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * The MappingTest class provides a method for mapping elements of a list to another type using a provided function.
 */

public class MappingTest {

	public static <T, R> List<R> mappingMethod(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<>();

		for (T item : list) {
			R value = function.apply(item);
			result.add(value);
		}

		return result;
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Hugo");
		names.add("Emilia");
		names.add("Antonia");
		names.add("Tim");
		names.add("Helga");
		names.add("Johannes");
		names.add("Odin");

		List<Person> persons = mappingMethod(names, Person::new);
		for (Person p : persons) {
			System.out.println(p.getName());
		}

		names = mappingMethod(persons, Person::getName);
		for (String s : names) {
			System.out.println(s);
		}
		
	}
}
