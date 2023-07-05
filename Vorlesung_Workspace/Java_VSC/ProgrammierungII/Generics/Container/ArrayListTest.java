package ProgrammierungII.Generics.Container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		// warum geht folgendes nicht:
		// List<String> list2 = new List<>();
		List<String> list = new ArrayList<>();
		list.add("Antonia");
		list.add("Emilia");
		list.add("Fritz");
		list.add("Hugo");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("---------------");
		list.add(3, "Özlem");
		list.remove(0);
		for (String s : list) {
			System.out.println(s);
		}
		
		// auch hier gilt: erster Index ist die 0
		System.out.println();
		list.add(1, "Eins");
		// Wiederholungen moeglich
		list.add("Fritz");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
