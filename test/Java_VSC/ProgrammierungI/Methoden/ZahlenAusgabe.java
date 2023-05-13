package ProgrammierungI.Methoden;

public class ZahlenAusgabe {
    public static void main(String[] args) {
        int zahl = 1;
        System.out.println("main sagt: " + zahl);
        methodeOhneParameter();
        methodeMitParameterGleicherName(zahl);
        methodeMitParameterAndererName(zahl);
    }

    public static void methodeOhneParameter() {
        int zahl = 5;
        System.out.println(zahl);

    }
    public static void methodeMitParameterGleicherName(int zahl) {
        System.out.println(zahl);
        
    }
    public static void methodeMitParameterAndererName(int anders) {
        System.out.println(anders); 
    }
}
