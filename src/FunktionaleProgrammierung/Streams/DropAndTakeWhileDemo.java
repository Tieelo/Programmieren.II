package streams;

import java.util.stream.Stream;

public class DropAndTakeWhileDemo {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 1, 2, 3);
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 1, 2, 3);

		stream1.takeWhile(n -> n < 4).forEach(System.out::println);
		System.out.println();
		stream2.dropWhile(n -> n < 4).forEach(System.out::println);
	}
}
