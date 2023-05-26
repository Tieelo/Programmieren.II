package designPatterns.observer.weatherStationLiveImplementation;

public class CurrentConditionsDisplay implements Observer {

	public CurrentConditionsDisplay() {
		
	}

	@Override
	public void update(float t, float h, float p) {
		System.out.println("Es sind " + t + 
				" Grad, Luftfeuchte von " + h + "% und Luftdruck von " + p + "bar.");
	}

}
