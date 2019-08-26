package com.foo.pattern.observer.usejdk;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDislpay(weatherData);
        weatherData.setMeasurements(80, 60, 30);
        weatherData.setMeasurements(80.5f, 60.5f, 30.5f);
    }
}
