package FunktionaleProgrammierung.Methodenreferenzen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterTest {
	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();

		for (T item : list) {
			if (predicate.test(item)) {
				result.add(item);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		List<Integer> result1 = filter(list, MyPredicates::isEven);
		for (int n : result1) {
			System.out.println(n);
		}

		List<Integer> result2 = filter(list, MyPredicates::isOdd);
		for (int n : result2) {
			System.out.println(n);
		}
	}
}