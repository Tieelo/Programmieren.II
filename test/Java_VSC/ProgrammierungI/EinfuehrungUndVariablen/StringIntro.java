package ProgrammierungI.EinfuehrungUndVariablen;

public class StringIntro {
    public static void main(String[] args) {
        // hier werden Variablen deklariert:
        String beginning = "Am Anfang";
        String middle = " war";
        String end = " das Wort.";
        // hier wird etwas am Bildschirm ausgegeben:
        System.out.println(beginning + middle + end);
        String complete = beginning + middle + end;
        System.out.println(complete);
        System.out.println(beginning.length());
        System.out.println(complete.length());
        System.out.println(middle.length());
        // System.out.println(beginning - middle);
    }
}
