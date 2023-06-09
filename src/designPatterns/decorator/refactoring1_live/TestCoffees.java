package designPatterns.decorator.refactoring1_live;

public class TestCoffees {
	public static void main(String[] args) {
		Beverage dr = new DarkRoast();
		dr.addCondiment(new Schoko());
		System.out.println(dr.exportDescription());
		System.out.println(dr.cost());

		Beverage hb = new HouseBlend();
		hb.addCondiment(new Milch());
		hb.addCondiment(new Schoko());
		hb.getCondiments().removeIf(condiment -> condiment instanceof Milch);
		hb.addCondiment(new Sahne());
		System.out.println(hb.exportDescription());
		System.out.println(hb.cost());
	}

}
