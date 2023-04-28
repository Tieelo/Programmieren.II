package Generics;

public class TestGenerischeMethoden {
    public static void main(String[] args) {
		
		M_Box<String> sbox = new M_Box<>();
		sbox.setMarke("marke-231");
		sbox.setValue("K2122");
		Utils.print(sbox);
		System.out.println();
		
		M_Box<Integer> box1 = new M_Box<>();
		box1.setValue(1000);
		M_Box<Integer> box2 = new M_Box<>();
		box2.setValue(2000);
		System.out.println("Box1: " + box1.getValue());
		System.out.println("Box2: " + box2.getValue());
		System.out.println();
		System.out.println("First swap");
		Utils.<Integer>exchange(box1, box2);
		System.out.println("Box1: " + box1.getValue());
		System.out.println("Box2: " + box2.getValue());
		System.out.println();
		System.out.println("Second swap");
		Utils.exchange(box1, box2);
		System.out.println("Box1: " + box1.getValue());
		System.out.println("Box2: " + box2.getValue());
	}
}
