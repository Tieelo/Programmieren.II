package ProgrammierungI.OO_KlassenvarKlassenmeth;

public class Verzinsung2 {
	public static void main(String[] args) {
		System.out.println(zinsen(1000, 0.025, 10));
	}

	public static double zinsen(double kapital, double zinssatz, int jahre) {
		if (jahre == 0)
			return kapital;
		
		return zinsen(kapital, zinssatz, jahre - 1) * (1 + zinssatz);
	}
}
