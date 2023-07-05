package ProgrammierungI.OO_Interfaces;

public class Obstlager {
	private static Obst[] bestand;
	
	static void print() {
		for (Obst item : bestand) {
			System.out.println(item.getName() + " hat Farbe " + item.getFarbe());
		}
	}
	
	static void setBestand(Obst ...obststuecke) {
		// bestand = new Obst[obststuecke.length];
		// for (int k = 0; k < obststuecke.length; k++) {
		// 	bestand[k] = obststuecke[k];
		// }
		// Wie kann ich diese Methode stark vereinfachen?
		bestand = obststuecke;
	}
}
