package ProgrammierungI.Nachklausur;

public class FehlerCodeStudLsg {
    // new fehlt:
	// static char[] alphabet = char[26];
	static char[] alphabet = new char[26];

	public static void fill() {
		// Array-Index wird überschritten; i nicht deklariert:
		// for (i = 0; i <= 26; i++) {
		for (int i = 0; i < 26; i++) {
			alphabet[i] = (char) (i + 97); // die rechte Seite dieser Zuweisung liefert die Kleinbuchstaben, angefangen
											// mit 'a'
		}
	}

// statisch-main könnte diese nicht-statische Methoden nicht aufrufen
// public void print() {
	public static void print() {
		// Array-Index wird überschritten; i nicht deklariert:
		// for (i = 0; i <= 26; i++) {
		for (int i = 0; i < 26; i++) {
			System.out.println(alphabet[i]);
		}
	}

	// private boolean main(String[] args)
	public static void main(String[] args) {
		fill();
		print();
		describeChar(alphabet[8]);
		System.out.print(add(12, 4));
	}

	public static void describeChar(char c) {
		System.out.print(c + " ist ");
		// Zuweisung statt Prüfung
		// if (c = 'e') {
		if (c == 'e') {
			System.out.print("der häufigste Buchstabe in der deutschen Sprache und ein Vokal");
		} else {
            if (c == 'a' | c == 'i' | c == 'o') {
                System.out.println("Vokal");
            }
			System.out.print("ein seltenerer Buchstabe und ein ");
// kein break, Redundanz, und die Prüfung nach e ist überflüssig
//			switch (c) {
//			case 'a':
//				System.out.println("Vokal");
//			case 'e':
//				System.out.println("Vokal");
//			case 'i':
//				System.out.println("Vokal");
//			case 'o':
//				System.out.println("Vokal");
//			case 'u':
//				System.out.println("Vokal");
//			default:
//				System.out.println("Konsonant");
//			}
			switch (c) {
			case 'a':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vokal");
				break;
			default:
				System.out.println("Konsonant");
			}

		}
	}
	
//	public static int add(int x, int y) {
//		return (x + y);
//	}

	// überladene Methoden müssen sich in ihren Parameterlisten unterscheiden, Parameternamen und Rückgabetyp sind egal:
	public static double add(int a, int b) {
		return (double)(a + b);
	}
}
