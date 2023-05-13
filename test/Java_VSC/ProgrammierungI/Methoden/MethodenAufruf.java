package ProgrammierungI.Methoden;

public class MethodenAufruf {
    public static void main(String[] args) {
        int x = 8;
        System.out.println("Variable x hat den Wert " + x);
        x();
    }

    public static void x() {
        System.out.println("Hier ist Methode x");
    }
}
