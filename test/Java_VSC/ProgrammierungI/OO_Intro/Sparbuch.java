package ProgrammierungI.OO_Intro;

public class Sparbuch {
	private int kontonummer = 450;
	private double kapital;
	private double zinssatz;

	public Sparbuch(int kontonummer, double kapital, double zinssatz) {
		this.kontonummer = kontonummer;
		this.kapital = kapital;
		this.zinssatz = zinssatz;
	}

	public void zahleEin(double betrag) {
		this.kapital += betrag;
	}

	public void hebeAb(double betrag) {
		this.kapital -= betrag;
	}

	public double getErtrag(int laufzeit) {
		double p = 1 + zinssatz / 100;
		double q = 1;

		for (int i = 0; i < laufzeit; i++)
			q *= p;

		return this.kapital * q;
	}

	public void verzinse() {
		this.kapital *= 1 + this.zinssatz / 100;
	}

	public int getKontonummer() {
		return this.kontonummer;
	}

	public double getKapital() {
		return this.kapital;
	}

	public double getZinssatz() {
		return this.zinssatz;
	}

	@Override
	public String toString() {
		return "Sparbuch [kontonummer=" + this.kontonummer + ", kapital=" + this.kapital + ", zinssatz=" + this.zinssatz
				+ "]";
	}

	// public boolean equals(Sparbuch other) {
	// if(other == null){
	// return false;
	// }
	// else if (this.kontonummer == other.kontonummer) {
	// return true;
	// } else {
	// return false;
	// }
	// }

	// public boolean equals(Sparbuch other) {
	// if(other!=null && (this.kontonummer == other.kontonummer)){
	// return true;
	// } else {
	// return false;
	// }
	// }

	// public boolean equals(Sparbuch other) {
	// if(other == null){
	// return false;
	// }
	// else if (this.kontonummer == other.kontonummer) {
	// return true;
	// } else {
	// return false;
	// }
	// }

	// public boolean equals(Sparbuch other) {
	// if(other == null){
	// return false;
	// }
	// if (this.kontonummer == other.kontonummer) {
	// return true;
	// }
	// return false;
	// }

	public boolean equals(Sparbuch other) {
		if (other == null) {
			return false;
		}
		return (this.kontonummer == other.kontonummer);
	}

}
