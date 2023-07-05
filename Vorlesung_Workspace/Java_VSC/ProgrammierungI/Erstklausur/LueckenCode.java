// Paktnamen weglassen:
package ProgrammierungI.Erstklausur;

public class LueckenCode extends SuperClass {
	private int a;
	// Ergaenzen Sie zu dieser Variable Code (vgl. Aufgabe 1)

	// naechste Zeile static weglassen als Luecke
	public static void aggregate() {

		// naechste Zeile freilassen als Luecke; es ist besonders wichtig, den Initialwert zuzuweisen
		int sum = 0;

		// naechste Zeile: Datentyp int weglassen: dann ist lokale Variable nicht korrekt deklariert
		for (int i = 0; i < 10; i++) {
			sum += i;

			System.out.println("Sum is currently " + sum);
		}
	}

	// ueberschreibende Methode weglassen als auszufuellende Luecke
	@Override
	public void information() {
		System.out.println("this is an object of class LueckenCode");
	}
	
	// in der naechsten Zeile den Parameter als Luecke weglassen
	public static boolean isFullAge(int age) {
		System.out.print("Is full aged? ");
		// volljaehrig ab einschl. 18 Jahren
		// naechste Zeile als Luecke weglassen
		return (age >= 18);
	}
	
	// public static void als Luecke lassen
	public static void main(String[] args) {
		// runde Klammer bei Methodenaufruf weglassen
		aggregate();
		// naechste Zeile waere eine Loesung; gebe zunaechst nur den Aufruf isFullAge(23) vor
		System.out.println(isFullAge(23));
	}
}
