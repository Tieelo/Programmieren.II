package designPatterns.observer.uebung.TemperatureObserver;

public class WeatherClient implements Observer{

    private String name;
    private WeatherData WeatherData;
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    public WeatherClient(WeatherData Weather, String name, String city){
        this.WeatherData = Weather;
        this.name = name;
        this.city = city;
        WeatherData.registerObserver(this);
    }
    public String getCity() {
        return city;
    }
    @Override
    public void update() {
        double temperature = WeatherData.getTemperature(city);
        double humidity = WeatherData.getHumidity(city);
        double pressure = WeatherData.getPressure(city);
        System.out.printf("%s hat für die Stadt %s folgende Daten erhalten: Temperatur %.2fC Luftfeuchtigkeit %.2f%% Luftdruck %.2fhPa\n", name, city, temperature, humidity, pressure);
    }
}
