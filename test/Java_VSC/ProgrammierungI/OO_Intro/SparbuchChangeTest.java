package ProgrammierungI.OO_Intro;

public class SparbuchChangeTest {
    public static void main(String[] args) {
        Sparbuch meinSparbuch = new Sparbuch(1234, 507.00, 2.00);
        System.out.println("In main, vorher: Kapital: " + meinSparbuch.getKapital());
        change(meinSparbuch);
        System.out.println("In main, nachher: Kapital: " + meinSparbuch.getKapital());
    }

    public static void change(Sparbuch s) {
		System.out.println("In change, vorher: Kapital: " + s.getKapital());
        s.hebeAb(25);
		s = new Sparbuch(0, 0, 0);
		System.out.println("In change, nachher: Kapital: " + s.getKapital());
	}
}
