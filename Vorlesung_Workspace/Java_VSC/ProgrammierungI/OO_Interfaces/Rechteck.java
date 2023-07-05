package ProgrammierungI.OO_Interfaces;

public class Rechteck implements Geo {
	double hoehe;
	double breite;

	public Rechteck(double hoehe, double breite) {
		super();
		this.hoehe = hoehe;
		this.breite = breite;
	}

	@Override
	public double getFlaeche() {
		return hoehe*breite;
	}

}
