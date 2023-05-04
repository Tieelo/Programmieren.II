package ExceptionHandling;

import java.util.Scanner;

public class DivideByInput {
    public static void main(String[] args) {
        try {
        Scanner input = new Scanner(System.in);
        System.out.print("Input divisor: ");
        int divisor = input.nextInt();
        input.close();
        System.out.println(100/divisor);
        }

        catch(ArithmeticException a) {
            System.out.println("Sie können nicht rechnen");
        }
        catch(Exception e) {
			System.out.println("Ganz allgemeiner Fehler aufgetreten");
		}
    }
}
