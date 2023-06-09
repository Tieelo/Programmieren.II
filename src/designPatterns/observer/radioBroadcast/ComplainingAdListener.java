package designPatterns.observer.radioBroadcast;

public class ComplainingAdListener implements AdListener {
	String reaktion;

	public ComplainingAdListener(String reaktion) {
		super();
		this.reaktion = reaktion;
	}

	@Override
	public void advertisement(AdEvent e) {
		System.out.println(this.reaktion + e.getSlogan());

	}
}
