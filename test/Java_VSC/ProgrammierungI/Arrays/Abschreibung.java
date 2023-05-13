package ProgrammierungI.Arrays;

public class Abschreibung {

    public static void main(String[] args) {
        double[] arrayTest = abschreibungArray();
		for (int l = 0; l < arrayTest.length; l++) {
			System.out.println("Jahr " + l + ": aktueller Buchwert = " + arrayTest[l]);
		}
    }

    static void abschreibenWhile() {
		double buchwert = 15000;
		double abschreibung = 0;
		double p = 0.4;
		double restwert = 100;
		int n = 1;
		while (buchwert > restwert) {
			abschreibung = buchwert * p;
			buchwert -= abschreibung;
			System.out.println("Nach " + n + " Jahren ist der aktuelle Buchwert = " + buchwert + ".");
			n++;
		};
	}

	static void abschreibenFor() {
		double buchwert = 15000;
		double p = 0.4;
		double abschreibung = 0;
		double restwert = 100;
		int n = 1;
		for (n=1; buchwert > restwert; n++) {
			abschreibung = buchwert * p;
			buchwert -= abschreibung;
			System.out.println("Abschreibung ist " + abschreibung);
			System.out.println("Nach " + n + " Jahren ist der aktuelle Buchwert = " + buchwert + ".");
		}
	}
	
	static double[] abschreibungArray() {
		double buchwert = 15000.;
		double satz = 40.;
		double restwert = 100.;
		int jahr = 1;
		double[] werte = new double[10];

		while (buchwert > restwert) {
			buchwert *= 1 - satz / 100;
			werte[jahr-1] = buchwert;
			jahr++;
		}
		return werte;
	}
}
