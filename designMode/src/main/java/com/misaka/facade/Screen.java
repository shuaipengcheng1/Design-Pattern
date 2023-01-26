package com.misaka.facade;

public class Screen {
    /*单例模式*/
    private  static volatile Screen instance ;

    public static Screen getInstance() {
        if(instance==null){
            synchronized (Screen.class){
                if(instance==null){
                    instance = new Screen();
                }
            }
        }
        return instance;
    }
    private Screen(){}

    public void on(){
        System.out.println("Screen on");
    }
    public void off(){
        System.out.println("Screen off");
    }
}
