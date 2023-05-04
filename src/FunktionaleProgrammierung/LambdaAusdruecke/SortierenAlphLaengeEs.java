package FunktionaleProgrammierung.LambdaAusdruecke;

import java.util.Arrays;
import java.util.Comparator;

public class SortierenAlphLaengeEs {

	public static void main(String[] args) {
		//Aufgabe 1
		String[] strings = { "Werkstoffkunde", "WiIng", "Tiergenetik", "Germanistik", "Physik", "Altorientalistik"};
		showArray(strings);

		Comparator<String> compLength = (s0, s1) -> s0.length() - s1.length();
		Comparator<String> compAlphabet = (s0, s1) -> s0.compareTo(s1);
		Comparator<String> compEs = (s0, s1) -> countEs(s0) - countEs(s1);
		
		Arrays.sort(strings, compEs);
		showArray(strings);
		
	}

	public static <T> void showArray(T[] arr) {
		System.out.println("--------------");
		System.out.println("Array-Inhalt:");
		System.out.println(Arrays.toString(arr));
	}

	private static int countEs(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }
}
