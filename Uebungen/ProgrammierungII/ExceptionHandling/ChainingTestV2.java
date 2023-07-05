package ProgrammierungII.ExceptionHandling;

public class ChainingTestV2 {
	public static String getNachbarn(int[] x, int i) throws MyExceptionV2 {
		try {
			return x[i - 1] + " " + x[i] + " " + x[i + 1];
		} catch (RuntimeException e) {
			throw new MyExceptionV2(e);
		}
	}

	public static void main(String[] args) {
		int[] a = null;
		int[] b = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(getNachbarn(a, 4));
		} catch (MyExceptionV2 e) {
			System.out.println("Ursache: " + e.getCause());
		}
		try {
			System.out.println(getNachbarn(b, 4));
		} catch (MyExceptionV2 e) {
			System.out.println("Ursache: " + e.getCause());
		}
	}
}
