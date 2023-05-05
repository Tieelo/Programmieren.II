package FunktionaleProgrammierung.LambdaAusdruecke.Uebung;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Termin {
    private String beschreibung;
    private String ort;
    private LocalDateTime zeit;

    public Termin(String beschreibung, String ort, LocalDateTime zeit) {
        this.beschreibung = beschreibung;
        this.ort = ort;
        this.zeit = zeit;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getOrt() {
        return ort;
    }

    public LocalDateTime getZeit() {
        return zeit;
    }

    public static void printTermine(Termin[] termine, Predicate <Termin> kriterium) {
        for (Termin termin : termine) {
            if (kriterium.test(termin)) {
                System.out.println(termin.getBeschreibung() + ", " + termin.getOrt() + ", " + termin.getZeit());
            }
        }
    }

    public static void main(String[] args) {
        Termin[] termine = {
                new Termin("Meeting", "Office", LocalDateTime.of(2023, 1, 1, 10, 0)),
                new Termin("Lunch", "Cafeteria", LocalDateTime.of(2023, 1, 1, 12, 0)),
                new Termin("Dinner", "Restaurant", LocalDateTime.of(2023, 1, 1, 18, 0)),
                new Termin("Movie", "Cinema", LocalDateTime.of(2023, 1, 1, 20, 0))
        };

        //Arrays.sort(termine, Comparator.comparing(Termin::getZeit));
        Arrays.sort(termine,(t1, t2) -> t1.getZeit().compareTo(t2.getZeit()));

        printTermine(termine, termin -> termin.getZeit().getHour() >= 17);
    }
}
