package ExceptionHandling;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			Konto1 kto = new Konto1(4711, 500);
			for (int i = 1; i <= 3; i++) {
				System.out.println("BEGINN SCHRITT " + i);
				try {
					switch (i) {
					case 1:
						kto.zahleAus(100);
						break;
					case 2:
						kto.zahleAus(700);
						break;
					case 3:
						kto.zahleAus(200 / 0);
						break;
					}
				} catch (KontoAusnahme e) {
					System.out.println(e);
				} finally {
					System.out.println("Ausgabe im finally-Block: " + kto.getSaldo());
				}
				System.out.println("ENDE SCHRITT " + i);
				System.out.println();
			}
		} catch (KontoAusnahme e) {
			System.out.println("Äußerer catch-Block");
			System.out.println(e);
		}
	}
}
