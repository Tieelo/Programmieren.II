package ProgrammierungI.OO_Intro;

public class Dog {
    String breed;
	int size;
	int age;
	String color;
	
	public Dog(String color) {
		this("Retriever", 1, 0, color);
	}
	
	public Dog(String brValue, int size, int age, String color) {
		this.breed = brValue;
		this.size = size;
		this.age = age;
		this.color = color;
	}

	public void eat() {
		System.out.println("chewing sound");
		size++;
	}
	
	public void sleep() {
		System.out.println("...snort");
	}
	
	public void bark() {
		System.out.println("Woof Woof Woof Woof Woof!");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", size=" + size + ", age=" + age + ", color=" + color + "]";
	}
	
}
