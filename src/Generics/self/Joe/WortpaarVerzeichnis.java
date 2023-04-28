package Generics.self.Joe;

import java.util.*;

public class WortpaarVerzeichnis {
    private Map<String, String> wortpaare = new HashMap<>();

    public void wortpaarEinfuegen(String deutsch, String englisch) {
        wortpaare.put(deutsch, englisch);
    }

    public String verzeichnisAlsZeichenkette() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : wortpaare.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public String englischeUebersetzung(String deutsch) {
        return wortpaare.get(deutsch);
    }

    public List<String> alleDeutschenWoerter() {
        List<String> deutscheWoerter = new ArrayList<>(wortpaare.keySet());
        Collections.sort(deutscheWoerter);
        return deutscheWoerter;
    }

    public List<String> alleEnglischenWoerter() {
        List<String> englischeWoerter = new ArrayList<>(wortpaare.values());
        Collections.sort(englischeWoerter);
        return englischeWoerter;
    }

    public static void main(String[] args) {
        WortpaarVerzeichnis verzeichnis = new WortpaarVerzeichnis();
        verzeichnis.wortpaarEinfuegen("Haus", "house");
        verzeichnis.wortpaarEinfuegen("Auto", "car");
        verzeichnis.wortpaarEinfuegen("Apfel", "apple");

        System.out.println("Verzeichnis:");
        System.out.println(verzeichnis.verzeichnisAlsZeichenkette());

        System.out.println("Englische Übersetzung von 'Haus':");
        System.out.println(verzeichnis.englischeUebersetzung("Haus"));

        System.out.println("Alle deutschen Wörter:");
        System.out.println(verzeichnis.alleDeutschenWoerter());

        System.out.println("Alle englischen Wörter:");
        System.out.println(verzeichnis.alleEnglischenWoerter());
    }
}
