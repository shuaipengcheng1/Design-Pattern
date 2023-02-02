package com.misaka.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Nacos extends Mediator {
    /*
     * 管理所有的同事类
     * */
    HashMap<String, Colleague> data;

    public Nacos() {
        this.data = new HashMap<>();
    }

    @Override
    void register(String name, Colleague colleague) {
        /*
         *注册
         * */
        data.put(name, colleague);
    }

    @Override
    void getMessage(String messageBody, String name) {
//判断消息 并且做出反应
        if (name.equals("login")) {
            if (Objects.equals(messageBody, "login")) {
                //            登录 --> 开启页面 --> 进入Home
                ((Login) data.get(name)).startLogin();
//
                ((Home) data.get("home")).startHome();
                ((Page) data.get("page")).startPage();

            } else if (Objects.equals(messageBody, "exit")) {
                ((Login) data.get(name)).exit();
            }
        } else if (name.equals("home")) {
            
        } else if (name.equals("page")) {
            
        }
    }
    public void show(){
    Set<Map.Entry<String, Colleague>> set= data.entrySet();
        for (Map.Entry<String,Colleague> item: set
             ) {
            System.out.println(item.getKey()+"  "+item.getValue());
        }
    }
}
