package com.misaka.observer.normal;

public class CurrentConditions {
    private  float temperature;
    private float pressure;
    private float humidity;
    private void display(){
        System.out.println("tem"+temperature);
        System.out.println("pre"+pressure);
        System.out.println("hum"+humidity);
    }


    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }





}
