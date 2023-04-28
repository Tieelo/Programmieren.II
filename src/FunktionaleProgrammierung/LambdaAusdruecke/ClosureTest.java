package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ClosureTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		List<Runnable> list = new ArrayList<>();

		for (int n : numbers) {
			list.add(() -> System.out.println(n));
		}

		for (Runnable r : list) {
			r.run();
		}
	}
}