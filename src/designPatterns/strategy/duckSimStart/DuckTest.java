package designPatterns.strategy.duckSimStart;

public class DuckTest {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.swim();
		mallard.display();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.quack();
		rubberDuck.display();
		rubberDuck.fly();
	}

}
