package Klausur;

import java.util.HashMap;
import java.util.Map;

public class personendaten {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Attila", 2.15);
        map.put("Marie", 1.62);
        map.put("Colin", 0.68);
        map.put("Thekla", 1.81);
        map.put("Richard", 1.62);

        Double marieData = map.get("Marie");
        if(marieData != null) {
            System.out.println("Marie ist im Container und hat Daten");
        } else if (map.containsKey("Marie")) {
            System.out.println("Zu Marie gibt es keine Daten");
        } else {
            System.out.println("Marie ist nicht im Container");
        }

        Double jamesData = map.get("James");
        if(jamesData != null) {
            System.out.println("James ist im Container und hat Daten");
        } else if (map.containsKey("James")) {
            System.out.println("Zu James gibt es keine Daten");
        } else {
            System.out.println("James ist nicht im Container");
        }
        Double theklaData = map.get("Thekla");
        System.out.println("Theklas Körpergröße: " +theklaData);
    }

}
