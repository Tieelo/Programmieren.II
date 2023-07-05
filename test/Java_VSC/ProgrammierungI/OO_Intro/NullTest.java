package ProgrammierungI.OO_Intro;

public class NullTest {
    public static void main(String[] args) {
        Sparbuch sb = new Sparbuch(4711, 1000, 3);
		sb.zahleEin(60000);
		System.out.println("In Main: Kapital: " + sb.getKapital());
		clear(sb);
		System.out.println("In Main: Kapital: " + sb.getKapital());
		Sparbuch sb2 = null;
		Sparbuch anderesSb = new Sparbuch(4711, 1000, 3);
		boolean ergebnis = sb.equals(anderesSb);
		System.out.println("Equals sagt " + ergebnis);
		if (sb2 == null) {
			System.out.println("sb2 ist nicht belegt!");
		} else {
			System.out.println("In Main: Kapital: " + sb2.getKapital());
		}
		System.out.println("Ende!");
    }

    public static void clear(Sparbuch s) {
		System.out.println("In Clear: Kapital: " + s.getKapital());
		s = new Sparbuch(0, 0, 0);
		s.hebeAb(20000);
		System.out.println("In Clear: Kapital: " + s.getKapital());
	}
}
