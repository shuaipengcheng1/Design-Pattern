package com.misaka.mediator;

/*
 * 同事类的抽象
 *
 * */
public abstract class Colleague {
    Mediator mediator;
    String name;

    public Colleague(Mediator mediator,String name) {
        this.name  = name;
        this.mediator = mediator;
        /*创建时就注册*/
        mediator.register(this.name,this);
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    abstract void sendMessage(String messageBody);

}
