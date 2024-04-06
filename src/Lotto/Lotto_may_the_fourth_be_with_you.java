package Lotto;
	import java.util.*;

	public class Lotto_may_the_fourth_be_with_you {
		public static void main(String[] args) {
			List<Integer> numbers = new ArrayList<>();
			for (int i = 1; i <= 49; i++) {
				numbers.add(i);
			}

			Collections.shuffle(numbers);

			List<Integer> lottoNumbers = numbers.subList(0, 6);

			Collections.sort(lottoNumbers);

			System.out.println("Ihre Lottozahlen sind: " + lottoNumbers);
		}
	}
