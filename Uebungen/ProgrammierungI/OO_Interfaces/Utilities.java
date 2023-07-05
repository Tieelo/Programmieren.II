package ProgrammierungI.OO_Interfaces;

public class Utilities {
	private static int count = 0;
	
	public Utilities() {
		// TODO Auto-generated constructor stub
	}
	
	public static void zeige(Anzeigbar a) {
		count++;
		System.out.println("Wir sind bei Nummer " + count);
		a.zeige();
	}

}
