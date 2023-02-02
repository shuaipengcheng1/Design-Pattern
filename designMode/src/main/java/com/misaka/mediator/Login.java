package com.misaka.mediator;
/*
* 登录 后 显示 page 显示 home
* */
public class Login extends Colleague{

    public void login(){
        sendMessage("login");
    }

    public Login(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void sendMessage(String messageBody) {
        mediator.getMessage(messageBody,name);
    }
    public void startLogin(){
        System.out.println("登录");
    }
    public void exit(){
        System.out.println("退出");
    }
}
