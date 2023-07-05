package ProgrammierungI.OO_KlassenvarKlassenmeth;

public class Verzinsung1 {
	public static void main(String[] args) {
		System.out.println(zinsen(1000, 0.025, 10));
	}

	public static double zinsen(double kapital, double zinssatz, int jahre) {
		for (int i = 0; i < jahre; i++) {
			kapital *= (1 + zinssatz);
		}

		return kapital;
	}
}
