package designPatterns.observer.radioBroadcast;

import java.util.EventObject;

// alle Ereignisklassen erweitern diese Java-Basisklasse
public class AdEvent extends EventObject {
	
	private String slogan;

	// source: Ereignisauslöser
	public AdEvent(Object source, String slg) {
		super(source);
		this.slogan = slg;
	}

	public String getSlogan() {
		return slogan;
	}

}
