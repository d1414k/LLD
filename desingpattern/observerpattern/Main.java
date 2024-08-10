package desingpattern.observerpattern;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(conditionsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(28.3f, 65.4f, 30.4f);
        weatherData.setMeasurements(27.8f, 70.1f, 29.2f);
        weatherData.removeObserver(forecastDisplay);
        System.out.println("After removing forecastDisplay");
        weatherData.setMeasurements(29.5f, 60.2f, 30.1f);
    }
}
