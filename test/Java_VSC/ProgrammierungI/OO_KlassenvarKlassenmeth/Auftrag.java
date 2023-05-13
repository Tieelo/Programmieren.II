package ProgrammierungI.OO_KlassenvarKlassenmeth;

public class Auftrag {
	private Artikel artikel;
	private int menge;
	
	public Auftrag(Artikel artikel, int menge) {
		this.artikel = artikel;
		this.menge = menge;
	}

//	public static double getGesamtwert(Auftrag... auftraege) {
//		double gesamtPreis = 0;
//		for (Auftrag auftrag : auftraege) {
//			gesamtPreis += auftrag.getMenge() * auftrag.getArtikel().getPreis();
//		}
//		return gesamtPreis;
//	}
	
	// aus Musterl�sung
	public double getAuftragswert() {
		return menge * artikel.getPreis();
	}
	
	public static double getGesamtwert(Auftrag... auftraege) {
		double gesamt = 0;
		
		for (Auftrag a : auftraege) {
			gesamt += a.getAuftragswert();
		}
		
		return gesamt;
	}

	public Artikel getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}
	
}

// in main
//Artikel art1 = new Artikel(101, 5.3);
//Artikel art2 = new Artikel(2020, 10.01);
//Artikel art3 = new Artikel(3033, 7.8);
//
//Auftrag auf1 = new Auftrag(art3, 4);
//Auftrag auf2 = new Auftrag(art1, 1);
//Auftrag auf3 = new Auftrag(art1, 5);
//
//Auftrag.getGesamtwert(auf1, auf2, auf3);


