package designPatterns.observer.uebung.TemperatureObserver;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.util.Observer;
import java.util.*;

public class WeatherData implements Subject{
    private Map<String, Double> temperatureMap;
    private Map<String, Double> humidityMap;
    private Map<String, Double> pressureMap;
    private List<java.util.Observer> observerList;
    public WeatherData(){
        temperatureMap = new HashMap<>();
        humidityMap = new HashMap<>();
        pressureMap = new HashMap<>();
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(java.util.Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(java.util.Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() throws Exception {
        for (java.util.Observer observer : observerList) {
            observer.update();
        }
    }
    public double getTemperature(String city){
        return temperatureMap.getOrDefault(city, 0.0);
    }
    public void setTemperature(String city, double temperature) throws Exception {
        temperatureMap.put(city, temperature);

    }
    public double getHumidity(String city) {
        return humidityMap.getOrDefault(city, 0.0);
    }

    public double getPressure(String city) {
        return pressureMap.getOrDefault(city, 0.0);
    }

    public void setHumidity(String city, double humidity) {
        humidityMap.put(city, humidity);
    }

    public void setPressure(String city, double pressure) {
        pressureMap.put(city, pressure);
    }

    public void fetchTemperatureFromAPI(String apiKey) throws Exception {
        for (Observer observer : observerList) {
            String city = ((WeatherClient) observer).getCity(); //Downcasting, da methode nicht im Interface angelegt ist

            String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(apiUrl);
            HttpResponse response = httpClient.execute(request);

            String jsonResponse = EntityUtils.toString(response.getEntity());
            JsonObject jsonObject = new Gson().fromJson(jsonResponse, JsonObject.class);
            JsonObject main = jsonObject.getAsJsonObject("main");

/*           for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                System.out.println(key + ": " + value);
            }*/
            double temperature = main.get("temp").getAsDouble() - 273.15; //Daten werden in Kelvin übertragen
            double humidity = main.get("humidity").getAsDouble();
            double pressure = main.get("pressure").getAsDouble();

            setTemperature(city, temperature);
            setHumidity(city, humidity);
            setPressure(city, pressure);
        }
        notifyObservers();
    }

/*    public void startFetchingTemperature(final String apiKey, final String city, int intervalInSeconds) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    double newTemperature = getTemperatureFromAPI(apiKey, city);
                    setTemperature(newTemperature);
                    notifyObservers();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, intervalInSeconds * 1000);
    }*/

}
