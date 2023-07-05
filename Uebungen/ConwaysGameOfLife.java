public class ConwaysGameOfLife {
	private static int L_x = 15;
	private static int L_y = 100;
	private static int showInterval = 1;
	private static int total_duration = 5000;

	private static boolean[][] field = new boolean[L_x][L_y];

	public static void main(String[] args) {
//		checkNeighbours(0, 10);
//		System.out.println("next");
//		checkNeighbours(7, 13);
//		System.out.println("next");
//		checkNeighbours(5, 25);
		
		initialiseGeneration();
		int t = 0;

		do {
			setNextGeneration();
			if (t % showInterval == 0 ) printGeneration();
			t++;
		} while (t < total_duration);
	}

	private static int checkNeighbours(int c_x, int c_y) {
		int sum = 0;
		int x;
		int y;
		for (int i = -1; i < 2; i++) {
			// Nachbarn in x-Richtung finden
			x = (c_x + i) % L_x;
			if (x < 0) {
				x += L_x;
			}
			for (int j = -1; j < 2; j++) {
				// zentrale Zelle auslassen:
				if (i == 0 && j == 0) {
					continue;
				}
				// Nachbarn in y-Richtung finden
				y = (c_y + j) % L_y;
				if (y < 0) {
					y += L_y;
				}
				// System.out.println("checking { " + x + ", " + y + " }");
				if (field[x][y]) {
					sum++;
				}
			}
		}
		return sum;
	}
	
	private static void initialiseGeneration() {
		for (int i = 0; i < L_x; i++) {
			for (int j = 0; j < L_y; j++) {
				if (Math.random() > 0.5) {
					field[i][j] = true;
				}
			}
		}
	}

	private static void setNextGeneration() {
		int n;
		// zuerst alle Zust�nde f�r die n�chste Generation berechnen
		boolean[][] nextGen = new boolean[L_x][L_y];
		for (int i = 0; i < L_x; i++) {
			for (int j = 0; j < L_y; j++) {
				// erstmal auf "Sterben" setzen
				nextGen[i][j] = false;
				
				n = checkNeighbours(i, j);
				if (field[i][j] == true) {
					// weiterleben:
					if (n == 2 || n == 3) {
						nextGen[i][j] = true;
					}
				} else {
					// Neugeburt:
					if (n == 3) {
						nextGen[i][j] = true;
					}
				}
			}
		}
		// erst dann die Werte setzen (sonst beeinflusst der neue Wert einer Position die Nachbarn)
		field = nextGen;
	}
	
	private static void printGeneration() {
		System.out.println("-------------------------------------");
		for (int i = 0; i < L_x; i++) {
			for (int j = 0; j < L_y; j++) {
				if (field[i][j] == true) {
					System.out.print("&");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
