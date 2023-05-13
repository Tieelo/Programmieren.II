package ProgrammierungII.Nachklausur_PII;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {

		Integer[] numbers = { 1, 12, 17, 8, 500, 35, 41 };
		System.out.println(Arrays.toString(numbers));

		Comparator<Integer> comp1 = (i0, i1) -> i0 - i1;
		Arrays.sort(numbers, comp1);
        System.out.println("Nach Größe sortiert");
		System.out.println(Arrays.toString(numbers));

        Comparator<Integer> comp2 = (i0, i1) -> (i0 % 10) - (i1 % 10);
		Arrays.sort(numbers, comp2);
        System.out.println("Nach letzter Stelle sortiert");
		System.out.println(Arrays.toString(numbers));
    }
}
