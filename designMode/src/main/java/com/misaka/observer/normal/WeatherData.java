package com.misaka.observer.normal;

public class WeatherData {
    private  float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;


    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    private void dataChange(){
        currentConditions.update(temperature,pressure,humidity);
    }

}
