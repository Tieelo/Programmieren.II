package ProgrammierungI.OO_Vererbung;

public class TestCounter {
    public static void main(String[] args) {
        SimpleCounter sc = new SimpleCounter();
        sc.increment();
        System.out.println("Aktueller Counter-Wert: " + sc.value);
    }
}
