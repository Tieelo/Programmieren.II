package ProgrammierungII.designPatterns.strategy.duckSimStart;

public abstract class Duck {
	
	public void quack() {
		System.out.println("Quacking");
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public void fly() {
		System.out.println("Flying");
	}
	
	public abstract void display();
}
