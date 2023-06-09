package designPatterns.observer.radioBroadcast;

import java.util.EventListener;

// erweitert die sog. Markierungsschnittstelle, die alle Java-Listener implementieren sollen
public interface AdListener extends EventListener {
	void advertisement( AdEvent e );
}
