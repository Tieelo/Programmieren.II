package designPatterns.observer.weatherStationLiveImplementation;

public class ForecastDisplay implements Observer {
	private double currentPressure = 1.032;  
	private double lastPressure;

	public ForecastDisplay() {
	}

	public void update(float t, float h, float p) {
        lastPressure = currentPressure;
		currentPressure = p;

		display();
	}

	public void display() {
		double differenz = currentPressure - lastPressure;
		if (differenz > 0) {
			System.out.println("das Wetter wird besser");
		} else if (differenz == 0) {
			System.out.println("das Wetter bleibt gleich");
		} else if (differenz < 0) {
			System.out.println("das Wetter wird schlechter");
		}
		
	}
}