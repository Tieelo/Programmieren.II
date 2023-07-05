package ProgrammierungI.OO_Intro;

public class SparbuchTest {
    public static void main(String[] args) {
        Sparbuch meinSparbuch = new Sparbuch(1234, 507.00, 2.00);
        System.out.println("In main, vorher: Kapital: " + meinSparbuch.getKapital());
        meinSparbuch.hebeAb(123);
        System.out.println("In main, Mitte: Kapital: " + meinSparbuch.getKapital());
        meinSparbuch = new Sparbuch(654, 789.00, 2.00);
        System.out.println("In main, nachher: Kapital: " + meinSparbuch.getKapital());
    }
}
