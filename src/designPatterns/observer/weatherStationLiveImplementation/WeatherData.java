package designPatterns.observer.weatherStationLiveImplementation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	float temp;
	float humidity;
	float pressure;
	private List<Observer> observerList;
	

	public WeatherData() {
		observerList = new ArrayList<>();		
	}

	public void setMeasurement(float t, float h, float p) {
		this.temp = t;
		this.humidity = h;
		this.pressure = p;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		 temp = getTemperature();
		 humidity = getHumidity();
		 pressure = getPressure();
		 notifyObservers();
			 
	}

	public float getTemperature() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	 public void registerObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.temp, this.humidity, this.pressure);
        }
	}
}
