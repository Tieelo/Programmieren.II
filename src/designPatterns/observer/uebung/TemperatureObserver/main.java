package designPatterns.observer.uebung.TemperatureObserver;

public class main {

    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();
        String apiKey = "a3e12a402912349b8b4d4316bb0e41d7";

        WeatherClient Mirco = new WeatherClient(weatherData, "Mirco", "Bonn");
        WeatherClient Martin = new WeatherClient(weatherData, "Martin", "London");
        WeatherClient Phillip = new WeatherClient(weatherData, "Phillip", "Koeln");
        while (true) {

            weatherData.fetchTemperatureFromAPI(apiKey);
            System.out.println();
            Thread.sleep(15000);
            System.out.println();

            Mirco.setCity("Prag");
            Martin.setCity("Hamburg");
            Phillip.setCity("Madrid");

        }
    }
}
