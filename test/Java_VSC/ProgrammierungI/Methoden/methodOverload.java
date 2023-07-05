package ProgrammierungI.Methoden;

public class methodOverload {
    public static void main(String[] args) {
        zeigePersonaldaten("Matthias", 48, "Hamburg");
        zeigePersonaldaten("Jim", 34);
        zeigePersonaldaten(3, "Jim");
        zeigePersonaldaten("Thea", "Berlin");
    }

    public static void zeigePersonaldaten(String name, int alter, String wohnort) {
        System.out.println(name + " wohnt in " + wohnort + " und ist " + alter + " Jahre alt.");
    }

    public static void zeigePersonaldaten(String name, String wohnort) {
        System.out.println(name + " wohnt in " + wohnort + ".");
    }

    public static void zeigePersonaldaten(String name, int alter) {
        System.out.println(name + " wohnt in Köln und ist " + alter + " Jahre alt.");
    }

    public static void zeigePersonaldaten(int anzahlHaustiere, String name) {
        System.out.println(name + " hat " + anzahlHaustiere + " Haustiere.");
    }
}
