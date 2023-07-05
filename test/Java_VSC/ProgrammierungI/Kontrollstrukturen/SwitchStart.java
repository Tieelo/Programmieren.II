package ProgrammierungI.Kontrollstrukturen;

public class SwitchStart {
	
	public static void main(String[] args) {
		String wochentag = "Freitag";
		switch (wochentag) {
			case "Montag":
				System.out.println("Es ist Werktag");
			case "Dienstag":
				System.out.println("Es ist Werktag");
			case "Mittwoch":
				System.out.println("Es ist Werktag");
			case "Donnerstag":
				System.out.println("Es ist Werktag");
			case "Freitag":
				System.out.println("Es ist Werktag");
			case "Samstag":
				System.out.println("Es ist Wochenende");
			case "Sonntag":
				System.out.println("Es ist Wochenende");
			default:
				System.out.println("Unbekannter Tag");
			}
	}
}
