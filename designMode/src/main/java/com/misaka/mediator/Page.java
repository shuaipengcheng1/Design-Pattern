package com.misaka.mediator;

public class Page extends Colleague{
    public void Page(){
        sendMessage("Page");
    }

    public Page(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void sendMessage(String messageBody) {
        mediator.getMessage(messageBody,name);
    }
    public void startPage(){
        System.out.println("page");
    }
}
