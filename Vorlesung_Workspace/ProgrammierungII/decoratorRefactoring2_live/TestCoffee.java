package ProgrammierungII.decoratorRefactoring2_live;

public class TestCoffee {

	public static void main(String[] args) {
		System.out.println("Hallo Kunde!");

		Beverage beverage = new HouseBlend();
		System.out.println("----------------------------------------");
		System.out.println("Kaffee ohne alles:");
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());

		beverage = new Milk(beverage);
		System.out.println("----------------------------------------");
		System.out.println("Kaffee mit Zutat:");
		System.out.println(beverage.cost());
		System.out.println(beverage.getDescription());
		beverage = new Milk(beverage);
		System.out.println("----------------------------------------");
		System.out.println("Kaffee mit weiterer Zutat:");
		System.out.println(beverage.cost());
		System.out.println(beverage.getDescription());
	}
}