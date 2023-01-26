package com.misaka.facade;

public class Audio {
    /*单例模式*/
    private  static volatile Audio instance ;

    public static Audio getInstance() {
        if(instance==null){
            synchronized (Audio.class){
                if(instance==null){
                   instance = new Audio();
                }
            }
        }
        return instance;
    }
    private Audio(){}

    public void on(){
        System.out.println("Audio on");
    }
    public void off(){
        System.out.println("Audio off");
    }
}

