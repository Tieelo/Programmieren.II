package designPatterns.decorator.refactoring2_live;

public class TestCoffees {

	public static void main(String[] args) 
	{
		Beverage myDarkRoast = new DarkRoast();
		CondimentDecorator dRwMilk = new Milk(myDarkRoast);  // amidoinitrite?
		CondimentDecorator dRwMilk2 = new Milk(dRwMilk);
		CondimentDecorator dRwMilkNot2 = new Milk(myDarkRoast); // != nur einmal Mich inside
		CondimentDecorator normalerName123 = new Whip(dRwMilk2);
		// Beverage dRwBlack = new Schwarz();
		// System.out.println(dRwBlack.cost() + " EUR");

		// Jungs es ist Debugging Only!!!!!!!!!!!!!!!!!!!! Ich brauche Wochenende
		System.out.println(myDarkRoast.cost() + " EUR, " + myDarkRoast.getDescription()); 
		System.out.println(dRwMilk.cost() + " EUR, " + dRwMilk.getDescription()); 
		System.out.println(dRwMilk2.cost() + " EUR, " + dRwMilk2.getDescription());
		System.out.println(dRwMilkNot2.cost() + " EUR, " + dRwMilkNot2.getDescription());

		// Whip hat keine Kosten, nur Description
		System.out.println(normalerName123.cost() + " EUR, " + normalerName123.getDescription());
		Beverage hb = new HouseBlend();
		System.out.println(hb.cost() + " EUR, " + hb.getDescription());
		CondimentDecorator hbMilky = new Milk(hb);
		System.out.println(hbMilky.cost() + " EUR, " + hbMilky.getDescription());
	}

}
