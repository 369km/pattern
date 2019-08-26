package com.foo.pattern.observer;

public class CurrentConditionDislpay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionDislpay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void dispaly() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "%humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        dispaly();
    }
}
