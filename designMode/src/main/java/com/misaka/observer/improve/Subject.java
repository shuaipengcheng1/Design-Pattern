package com.misaka.observer.improve;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
     void notifyObserver();
    void setData(float temperature, float pressure, float humidity);
}
