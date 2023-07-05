package ProgrammierungII.functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    public static void main(String[] args) {

		String[] strings = { "Werkstoffkunde", "xxxxx", "WiIng", "zzzzz", "Germanistik", "TierGenetik", "Physik", "Altorientalistik"};
		showArray(strings);

		// Comparator<String> comp1 = (s0, s1) -> s0.length() - s1.length();
		Comparator<String> comp2 = (s0, s1) -> s0.compareTo(s1);
        //Comparator<String> comp = (s0, s1) -> countEs(s0) - countEs(s1);
		
		Arrays.sort(strings, comp2);
		showArray(strings);
    }

    private static <T> void showArray(T[] arr) {
		System.out.println("--------------");
		System.out.println("Array-Inhalt:");
		System.out.println(Arrays.toString(arr));
	}

    // private static int countEs(String s) {
    //     long result = s.chars().filter(ch -> ch == 'e').count();
    //     return (int) result;
    // }
}
