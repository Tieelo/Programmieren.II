package ProgrammierungI.OO_KlassenvarKlassenmeth;

public class Artikel {
	private int id;
	private double preis;
	
	public Artikel(int id, double preis) {
		this.id = id;
		this.preis = preis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

}

//in main
// siehe Auftrag.java
