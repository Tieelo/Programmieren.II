package ProgrammierungI.OO_Intro;

public class Dog_constructorWithArgs {
    String breed;
	String size;
	int age;
	String color;
	
	public Dog_constructorWithArgs(String brValue, String size, int age, String color) {
		this.breed = brValue;
		this.size = size;
		this.age = age;
		this.color = color;
	}

	public void eat() {
		System.out.println("chewing sound");
	}
	
	public void sleep() {
		System.out.println("snort");
	}
	
	public void bark() {
		System.out.println("barking noise");
	}
}
