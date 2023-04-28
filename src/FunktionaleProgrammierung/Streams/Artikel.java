package streams;

public class Artikel {
	private int id;
	private char typ;
	private double preis;

	public Artikel() {
	}

	public Artikel(int id, char typ, double preis) {
		this.id = id;
		this.typ = typ;
		this.preis = preis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getTyp() {
		return typ;
	}

	public void setTyp(char typ) {
		this.typ = typ;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String toString() {
		return id + " " + typ + " " + preis;
	}
}