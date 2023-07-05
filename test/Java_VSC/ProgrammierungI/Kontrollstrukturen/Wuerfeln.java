package ProgrammierungI.Kontrollstrukturen;

import java.util.Random;

public class Wuerfeln {
    public static void main(String[] args) {
        throwDice();
        drawLargerRandom(100, 13);
	}

    private static void throwDice() {
        Random random = new Random();
        int number;
		do {
            number = random.nextInt(6) + 1;
            System.out.println(number);
        } while (number != 6);
    }

    private static void drawLargerRandom(int limit, int stop) {
        Random random = new Random();
        int number;
		do {
            number = random.nextInt(limit) + 1;
            System.out.println(number);
        } while (number != stop);
    }
}
