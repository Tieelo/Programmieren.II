package ProgrammierungII.Generics.Container;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class VordefiniertesTest {

	public static void main(String[] args) {
		List<String> list = List.of("L_Hugo", "L_Emil", "L_Tim");
		for (String s : list) {
			System.out.println(s);
		}

		Set<String> set = Set.of("S_Hugo", "S_Emil", "S_Tim");
		for (String s : set) {
			System.out.println(s);
		}
		
		Map.Entry<Integer, String> entry1 = Map.entry(1, "M_Hugo");
		Map.Entry<Integer, String> entry2 = Map.entry(2, "M_Emil");
		Map.Entry<Integer, String> entry3 = Map.entry(3, "M_Tim");

		Map<Integer, String> map = Map.ofEntries(entry1, entry2, entry3);
		
		// entry1.setValue("modifiziert");

		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
