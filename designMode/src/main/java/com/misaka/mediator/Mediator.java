package com.misaka.mediator;
/*
* 中介者抽象
* */
public abstract class Mediator {

    abstract void register(String name,Colleague colleague);
   abstract void getMessage(String messageBody,String name);
   abstract void show();
}
