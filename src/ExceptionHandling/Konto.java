package ExceptionHandling;

public class Konto {
	private int kontonummer;
	private double saldo;

	public Konto() {
	}

	public Konto(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public Konto(int kontonummer, double saldo) throws KontoAusnahme {
		if (saldo < 0)
			// todo
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	public int getKontonummer() {
		// todo
		return 0;
	}

	public void setKontonummer(int nr) {
		// todo
	}

	public double getSaldo() {
		// todo
		return 0;
	}

	public void setSaldo(double betrag) throws KontoAusnahme {
		// todo
	}

	public void zahleEin(double betrag) throws KontoAusnahme {
		// todo
	}

	public void zahleAus(double betrag) throws KontoAusnahme {
		// todo
	}

	public void info() {
		System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
	}
}
