package com.foo.pattern.observer.usejdk;

import com.foo.pattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDislpay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionDislpay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void dispaly() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "%humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            dispaly();
        }
    }
}
