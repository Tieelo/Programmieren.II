package FunktionaleProgrammierung.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DropAndTakeWhileDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,5,8,9,16,23);
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 1, 2, 3);
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 1, 2, 3);
		Stream<Integer> stream3 = list.stream();

		stream1.takeWhile(n -> n < 4).forEach(System.out::println);
		System.out.println();
		stream2.dropWhile(n -> n < 4).forEach(System.out::println);
		System.out.println("new shit");
		stream3.sorted((s0, s1) -> s1 - s0).forEach(System.out::println);
	}
}
