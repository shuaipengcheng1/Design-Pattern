package com.misaka.observer.improve;

public abstract class Observer {
    float temperature;
    float pressure;
    float humidity;

    void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    ;

    abstract void display();
}
