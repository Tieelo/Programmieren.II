package ExceptionHandling;

public class Division1 {
	public static void main(String[] args) {
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println(10 / i);
			}
		} catch (ArithmeticException e) {
			System.out.println("Mathe");
            throw new ArithmeticException();
        }

    }
}
