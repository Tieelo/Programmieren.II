package FunktionaleProgrammierung.Methodenreferenzen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumingTest {
	private String header;

	public ConsumingTest(String header) {
		this.header = header;
	}

	public void output(String s) {
		System.out.println(header + " " + s);
	}

	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T item : list) {
			consumer.accept(item);
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hugo");
		list.add("Emil");
		list.add("Anton");

		forEach(list, n -> System.out.println(n));
		forEach(list, System.out::println);

		list.forEach(n -> System.out.println(n));
		list.forEach(System.out::println);

		ConsumingTest t = new ConsumingTest("#");
		list.forEach(t::output);
	}
}