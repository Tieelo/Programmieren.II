package ProgrammierungII.functionalProgramming.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterTestLambda {
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
		
		System.out.println("List: ");
		for (int n : list) {
			System.out.println(n);
		}

		List<Integer> result = filter(list, n -> n % 2 == 0);

		System.out.println("Herausgefiltert: ");
		for (int n : result) {
			System.out.println(n);
		}
	}
}