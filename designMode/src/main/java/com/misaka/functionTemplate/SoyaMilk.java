package com.misaka.functionTemplate;

public class SoyaMilk extends TemplateFactory{
    @Override
    void addMateriel() {
        System.out.println("添加黄豆");
    }

    @Override
    void chooseMateriel() {
        System.out.println("选择黄豆");

    }

    @Override
    void put() {
        System.out.println("放入黄豆");

    }

    @Override
    void smash() {
        System.out.println("打碎黄豆");

    }

    @Override
    public void addNoMetateriel() {
        System.out.println("钩子");
        super.addNo = true;
    }
}
