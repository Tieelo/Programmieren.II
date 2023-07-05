package ProgrammierungII.singletonPattern;

public class ChocolateController {
    public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
        System.out.println("Boiler1: " + boiler);

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println("Boiler2: " + boiler2);
	}
}
