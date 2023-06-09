package designPatterns.observer.radioBroadcast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.event.EventListenerList;

public class Radio {
	private EventListenerList listeners = new EventListenerList();
	private List<String> ads = Arrays.asList("Bratöl - reich an gesättigten Fettsäuren",
			"Grafiktablet fuer die schönsten UML-Diagramme",
			"Siebenmeilenstiefel: schnell und sicher an den gewünschten Ort",
			"Chappi - frische Bestandteile, schonend gekocht fuer Ihren Liebling");

	// etwas komplizierter: verschachtelte, neue Instanziierungen
	// Prinzip: beim Erzeugen eines Radio-Objekts wird ein Timer aktiviert, der regelmäßig 
	// Werbung verschickt
	// Frage: welches Argument erwartet schedule(...)?
	public Radio() {
		new Timer().schedule( new TimerTask() {
			@Override public void run() {
				Collections.shuffle(ads);
				notifyAdvertisement( new AdEvent( this, ads.get(0) ) );
			}
		}, 0, 500);
	}
	
	public void addAdListener(AdListener adL) {
		this.listeners.add(AdListener.class, adL);
	}
	
	public void removeAdListener(AdListener adL) {
		this.listeners.remove(AdListener.class, adL);
	}

	protected synchronized void notifyAdvertisement(AdEvent adEvent) {
		for ( AdListener l : listeners.getListeners(AdListener.class) )
			l.advertisement(adEvent);
	}
}
