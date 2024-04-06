package Lotto;
import java.util.Random;
import java.util.HashSet;

	public class Lotto_the_3rd {
		public static void main(String[] args) {
			final int TOTAL_NUMBERS = 6;
			final int MAX_NUMBER = 49;
			Random random = new Random();
			HashSet<Integer> generated = new HashSet<>();

			while (generated.size() < TOTAL_NUMBERS) {
				int nextNum = random.nextInt(MAX_NUMBER) + 1; // +1 because nextInt is 0 inclusive and upper bound exclusive.
				generated.add(nextNum);
			}

			System.out.println("Your lotto numbers are: " + generated);
		}
	}
