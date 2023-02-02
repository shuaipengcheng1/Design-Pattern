package com.misaka.observer.normal;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
//        聚合current
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(1.0f,12.0f,13.0f);

    }
}
