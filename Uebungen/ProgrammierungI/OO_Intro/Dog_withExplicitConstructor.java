package ProgrammierungI.OO_Intro;

public class Dog_withExplicitConstructor {
    String breed;
	String size;
	int age;
	String color;

	public Dog_withExplicitConstructor(String pColor, String pSize) {
		this.color = pColor;
		this.size = pSize;
	}
	
	public Dog_withExplicitConstructor(int pAge, String pColor) {
		// this.breed = "testRasse";
		// this.size = "medium";
		// this.age = pAge;
		// this.color = pColor;
		// this.bark();
		this("big", pAge, pColor);
	}

	public Dog_withExplicitConstructor(String pSize, int pAge, String pColor){
		this.breed = "testRasse";
		this.size = pSize;
		this.age = pAge;
		this.color = pColor;
	}

	public Dog_withExplicitConstructor(String pBreed, String pColor, int pAge){
		this.breed = pBreed;
		this.color = pColor;
		this.age = pAge;
		this.size = "small";
	}

	public void eat() {
		System.out.println("chewing sound");
		this.size = "large";
	}
	
	public void sleep() {
		System.out.println("snort");
	}
	
	public void bark() {
		System.out.println("barking noise");
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog_withExplicitConstructor [breed=" + breed + ", size=" + size + ", age=" + age + ", color=" + color
				+ "]";
	}

	// public String toString() {
	// 	return this.breed + this.size + this.color + this.age;
	// }
	
}
