package designPatterns.observer.radioBroadcast;

public class RadioDemo {

	public static void main(String args[]) {
		Radio r = new Radio();
		ComplainingAdListener cal = new ComplainingAdListener("Oh mein Gott! Das muss ich kaufen: ");
		r.addAdListener(cal);
		r.addAdListener(new ComplainingAdListener("Oh nein, schon wieder Werbung! "));
		r.addAdListener(e -> System.out.println("Ich höre nichts"));
	}
}
