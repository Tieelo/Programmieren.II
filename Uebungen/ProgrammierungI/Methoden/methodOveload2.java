package ProgrammierungI.Methoden;

public class methodOveload2 {
    public static void main(String[] args) {
        zeigePersonaldaten("Matthias", 48, "Hamburg");
        zeigePersonaldaten("Sopihe", "Düsseldorf");
        zeigePersonaldaten("Hännes", 3);
    }

    public static void zeigePersonaldaten(String name, int alter, String wohnort) {
        System.out.println(name + " wohnt in " + wohnort + " und ist " + alter + " Jahre alt.");
    }

    public static void zeigePersonaldaten(String name, String wohnort) {
        zeigePersonaldaten(name, 25, wohnort);
    }

    public static void zeigePersonaldaten(String name, int alter) {
        zeigePersonaldaten(name, alter, "Köln");
    }

}
