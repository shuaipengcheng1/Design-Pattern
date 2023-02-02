package com.misaka.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> list = new ArrayList<>();
    private  float temperature;
    private float pressure;
    private float humidity;

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for (Observer item:list
             ) {
            item.update(temperature,pressure,humidity);
        }
    }
}
