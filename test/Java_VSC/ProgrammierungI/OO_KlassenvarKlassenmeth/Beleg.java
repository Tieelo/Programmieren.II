package ProgrammierungI.OO_KlassenvarKlassenmeth;

public class Beleg {
	private static int next = 10000;
	private int belegNummer;

	public Beleg() {
		belegNummer = next++;
	}

	public int getBelegNummer() {
		return belegNummer;
	}
}

//in main
//Beleg b1 = new Beleg();
//Beleg b2 = new Beleg();
//Beleg b3 = new Beleg();
//
//System.out.println(b1.getBelegNummer());
//System.out.println(b2.getBelegNummer());
//System.out.println(b3.getBelegNummer());