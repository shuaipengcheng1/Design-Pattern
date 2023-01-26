package com.misaka.facade;

public class Projector {
    /*单例模式*/
    private  static  Projector instance ;

    public static Projector getInstance() {
        if(instance==null){
            synchronized (Projector.class){
                if(instance==null){
                    instance = new Projector();
                }
            }
        }
        return instance;
    }
    private Projector(){}

    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
}
