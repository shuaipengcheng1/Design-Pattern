package com.misaka.observer.improve;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Subject weatherData = new WeatherData();
        Observer baidu = new Baidu();
        Observer sina = new Sina();

        weatherData.register(baidu);
        weatherData.register(sina);
        weatherData.setData(1.0f,1.0f,1.0f);


        Thread.sleep(4000);
        weatherData.remove(sina);
        weatherData.setData(2.0f,1.0f,2.0f);

    }
}
