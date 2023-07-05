package ProgrammierungII.Klausur;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonAgeMap {
    public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//HashMap map = new HashMap<String, Integer>(); // Nekum
		System.out.println(map.put("Herrman", 85));
		System.out.println(map.put("Marie", 24));
		System.out.println(map.put("Colin", 1));
		System.out.println(map.put("Andrea", 51));
		
        System.out.println(map.containsKey("Marie"));
        System.out.println(map.containsKey("James"));
        System.out.println(map.get("Andrea"));

		System.out.println(map.containsKey("Marie")? "ja" : "nein");
		System.out.println(map.containsKey("James")? "ja" : "nein");
        // System.out.println("Variante 1");
		// for (String key : map.keySet())
		// 	System.out.println(key + ": " + map.get(key));
		// System.out.println("Variante 2");
		// for (Map.Entry<String, Integer> e : map.entrySet())
		// 	System.out.println(e.getKey() + ": " + e.getValue());
        System.out.println("Die Volljährigen: ");
        map.entrySet().stream().filter(m -> m.getValue() > 18).forEach(System.out::println);

		List<Double> d = List.of(1.2, 4.4, 1.9);
		print(d);
		List<Integer> i = List.of(2, 4, 9);
		print(i);
	}

	static void print (List<? extends Number> l) {
		System.out.println(l);
	}
}
