package com.misaka.facade;

/*外观类*/
public class Facade {
    //    聚合
    private Audio audio;
    private Projector projector;
    private Screen screen;

    /*初始化*/
    public Facade() {
        audio = Audio.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
    }

    public void on() {
//        System.out.println(Audio.getInstance());
        audio.on();
        projector.on();
        screen.on();
    }

    public void off() {
        audio.off();
        projector.off();
        screen.off();
    }

}
