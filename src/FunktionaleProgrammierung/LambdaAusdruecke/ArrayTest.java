package lambdaExpressions;

import java.util.function.BinaryOperator;

public class ArrayTest {
	public static <T> T fold(BinaryOperator<T> op, T first, T... items) {
		T result = first;
		for (T item : items) {
			// das aktuell Bestehende (result) wird erweitert um das naechste Element (item)
			result = op.apply(result, item);
		}

		return result;
	}

	public static void main(String[] args) {
		// sich die Argumente fuer fold (und deren Reihenfolge) klar machen:
		String s = fold((s1, s2) -> s1 + s2, "", "a", "b", "c");
		System.out.println(s);

		int x = fold((s1, s2) -> s1 + s2, 0, 1, 2, 3);
		System.out.println(x);
	}
}