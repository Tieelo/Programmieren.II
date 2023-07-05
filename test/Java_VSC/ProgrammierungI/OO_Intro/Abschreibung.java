package ProgrammierungI.OO_Intro;

public class Abschreibung {
	private double preis;
	private int jahre;
	private double satz;

	public Abschreibung(double preis, int jahre) {
		this.preis = preis;
		this.jahre = jahre;
	}

	public Abschreibung(double preis, int jahre, double satz) {
		this.preis = preis;
		this.jahre = jahre;
		this.satz = satz;
	}

	public void schreibeLinear() {
		double x = preis / jahre;
		System.out.println("Lineare Abschreibung:");
		for (int i = 1; i <= jahre; i++) {
			preis -= x;
			System.out.println(i + "\t" + preis);
		}
		System.out.println(this);
	}

	public void schreibeDegressiv() {
		if (satz == 0.0) {
			System.out.println("Bitte satz belegen");
		} else {
			System.out.println("Geometrisch degressive Abschreibung:");
			for (int i = 1; i <= jahre; i++) {
				preis *= 1 - satz / 100;
				System.out.println(i + "\t" + preis);
			}
		}
	}
}
