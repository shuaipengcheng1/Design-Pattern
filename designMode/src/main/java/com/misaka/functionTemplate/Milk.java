package com.misaka.functionTemplate;

public class Milk extends TemplateFactory{
    @Override
    void addMateriel() {
        System.out.println("添加牛奶");
    }

    @Override
    void chooseMateriel() {
        System.out.println("选择牛奶");

    }

    @Override
    void put() {
        System.out.println("放入牛奶");

    }

    @Override
    void smash() {
        System.out.println("打碎牛奶");

    }

}
