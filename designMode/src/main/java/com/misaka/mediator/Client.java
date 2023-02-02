package com.misaka.mediator;

public class Client {
    public static void main(String[] args) {
        /* 中介对象 类似微服务注册中心*/
        Mediator mediator  = new Nacos();
        /*同事对象 就是微服务对象*/
        Colleague login = new Login(mediator,"login");
        Colleague home = new Home(mediator,"home");
        Colleague page = new Page(mediator,"page");
        mediator.show();
        login.sendMessage("login"); // 发送登录消息 流程交给中介来处理
        login.sendMessage("exit");
    }
}
