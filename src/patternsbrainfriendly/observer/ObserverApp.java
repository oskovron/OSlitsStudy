package patternsbrainfriendly.observer;

public class ObserverApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(22, 60, 33);
    }
}
