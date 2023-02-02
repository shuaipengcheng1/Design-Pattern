package com.misaka.mediator;

public class Home extends Colleague{
    public void Home(){
        sendMessage("Home");
    }

    public Home(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void sendMessage(String messageBody) {
        mediator.getMessage(messageBody,name);
    }
    public void startHome(){
        System.out.println("home");
    }
}
