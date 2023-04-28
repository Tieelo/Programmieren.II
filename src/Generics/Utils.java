package Generics;

public class Utils {

	public static <T> void print(M_Box<T> a) {
		System.out.println("Marke ist " + a.getMarke());
		System.out.println("Wert ist " + a.getValue());
	}

	public static <E> void exchange(M_Box<E> a, M_Box<E> b) {
		E value = b.getValue();
		b.setValue(a.getValue());
		a.setValue(value);
	}
}