import java.util.Random;
import java.util.Scanner;

public class Leitmotiv {
    public static void main(String[] args) {
		int n_phrases = 20;
		for (int i = 0; i < n_phrases; i++) {
			fixedLength();
		}
	}
	
	static void fixedLength() {
		int n_tones = 4;
		Random randomNum = new Random();
		for (int i = 0; i < n_tones; i++) {
			System.out.print((randomNum.nextInt(12) + 1) + " ");
		}
		System.out.println();
	}
	
	static void flexibleLength() {
		Random randomNum = new Random();
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());
		for (int i = 0; i < n; i++) {
			System.out.print((randomNum.nextInt(12) + 1) + " ");
		}
		System.out.println();
		scanner.close();
	}
}
