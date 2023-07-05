package ExceptionHandling;

public class KontoAusnahme extends RuntimeException {

	public KontoAusnahme() {
	}

	public KontoAusnahme(String message) {
		super(message);
	}
}
