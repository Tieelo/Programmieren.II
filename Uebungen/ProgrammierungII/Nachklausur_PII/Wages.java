package ProgrammierungII.Nachklausur_PII;

import java.util.HashMap;
import java.util.Map;

public class Wages {
    public static void main(String[] args) {
        Map<Integer, Double> map = new HashMap<>();
        System.out.println(map.put(301, 3000.99));
        System.out.println(map.put(302, 2500.50));
        System.out.println(map.put(1003, 3000.99));
        System.out.println(map.put(1004, 2500.50));

        System.out.println("Hat 302? " + map.containsKey(302));
        System.out.println("Hat 666? " + map.containsKey(666));

        System.out.println("Gehalt von 1004: " + map.get(1004));

        System.out.println("Alle Mitarbeiter " + map.keySet());

        System.out.println("Map hat diese Größe: " + map.size());
        System.out.println("Durchschnittsgehalt: " + map.values().stream().reduce(0.0, Double::sum)/map.size());

        // map.entrySet().stream().filter(el -> el.getValue() > 3000.00).forEach(System.out::println);
    }
}
