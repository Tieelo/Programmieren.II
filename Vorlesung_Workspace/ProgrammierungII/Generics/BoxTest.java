package ProgrammierungII.Generics;

public class BoxTest {
	public static void main(String[] args) {
		
		// Box box1 = new Box();
		// box1.setValue("Hugo Meier");
		// Box box2 = new Box();
		// box2.setValue(4711);
		
		// System.out.println(((String) box1.getValue()).length());
		// System.out.println(((Integer) box2.getValue()) + 1);
		
		// box1.setValue(123);
		// System.out.println(box1.getValue());
		
		G_Box<String> sbox = new G_Box<>();
		System.out.println("sbox before setting: ");
		print(sbox);
		sbox.setValue("Hugo Meier");
		System.out.println("sbox after setting: ");
		print(sbox);
		G_Box<Integer> ibox = new G_Box<>();
		System.out.println("ibox before setting: ");
		print(ibox);
		ibox.setValue(4711);
		System.out.println("ibox after setting: ");
		print(ibox);
		
		//sbox.setValue(123);
		ibox.setValue(2343);
		
		// G_Box<?> box = ibox;
		// System.out.println("box after assigning: ");
		// print(box);
		// box.setValue(null);
		// System.out.println("box after setting: ");
		// print(box);
		// System.out.println("ibox after setting: ");
		// print(ibox);
		
		// G_Box<String> gbox1 = new G_Box<String>();
		// gbox1.setValue("AAeeAHugo Meier");
		// G_Box<Integer> gbox2 = new G_Box<Integer>();
		// gbox2.setValue(123451);
		// System.out.println(gbox1.getValue().length());
		// System.out.println(gbox2.getValue() + 1);
		// gbox1.setValue(4711);

	}
	
	public static void print(G_Box<?> box) {
		Object obj = box.getValue();
		if (obj == null)
		System.out.println("Box ist leer");
		else
		System.out.println("Inhalt: " + obj);
		}
}
