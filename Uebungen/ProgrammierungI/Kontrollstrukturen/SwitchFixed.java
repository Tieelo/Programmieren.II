package ProgrammierungI.Kontrollstrukturen;

public class SwitchFixed {

    public static void main(String[] args) {
		String wochentag = "Donnerstag";

		switch (wochentag) {
			case "Montag":
				System.out.println("Es ist Werktag");
				break;
			case "Dienstag":
				System.out.println("Es ist Werktag");
				break;
			case "Mittwoch":
				System.out.println("Es ist Werktag");
				break;
			case "Donnerstag":
				System.out.println("Es ist Werktag");
				break;
			case "Freitag":
				System.out.println("Es ist Werktag");
				break;
			case "Samstag":
				System.out.println("Es ist Wochenende");
				break;
			case "Sonntag":
				System.out.println("Es ist Wochenende");
				break;
			default:
				System.out.println("Unbekannter Tag");
				break;
			}

			System.out.println("-------------------------------------------------");

			switch (wochentag) {
				case "Montag":
				case "Dienstag":
				case "Mittwoch":
				case "Donnerstag":
				case "Freitag":
					System.out.println("Es ist Werktag");
					break;
				case "Samstag":
				case "Sonntag":
					System.out.println("Es ist Wochenende");
					break;
				default:
					System.out.println("Unbekannter Tag");
					break;
				}
	}
}
