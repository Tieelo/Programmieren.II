package ProgrammierungII.Klausur;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {

		String[] strings = { "Myanmar", "Bali", "Deutschland", "Zypern", "Armenien", "Bolivien", "Sudan", "Philippinen"};
		System.out.println(Arrays.toString(strings));

		// Comparator<String> comp1 = (s0, s1) -> s0.length() - s1.length();
		Comparator<String> comp2 = (s0, s1) -> s0.compareTo(s1);
		
		Arrays.sort(strings, comp2);
        System.out.println("--------------------");
		System.out.println(Arrays.toString(strings));
    }
}
