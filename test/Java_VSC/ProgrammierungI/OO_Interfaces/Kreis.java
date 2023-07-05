package ProgrammierungI.OO_Interfaces;

public class Kreis implements Geo {
	double radius;

	public Kreis(double r) {
		this.radius = r;
	}

	@Override
	public double getFlaeche() {
		return 3.1416 * radius * radius;
	}

}
