package ProgrammierungI.OO_Interfaces;

public class Test {

	public static void main(String[] args) {
		// Sparbuch s = new Sparbuch(123456, 352.43, 0.5);
		// Utilities.zeige(s);
		// s = new Sparbuch(4567, 12.73, 0.5);
		// Utilities.zeige(s);
		// s = new Sparbuch(909090, 52.43, 0.1);
		// Utilities.zeige(s);
		// s = new Sparbuch(234561, 32.13, 3.5);
		// Utilities.zeige(s);
		Obstlager.setBestand(new Apfel(), new Birne(), new Orange(), new Birne(), new Birne());
		Obstlager.print();

	}

}
