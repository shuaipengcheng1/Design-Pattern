package com.misaka.memento;

/*
* 备忘录模式原始对象
* */
public class Originator {
    private String state; //状态

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
//    编写一个方法 可以保存一个状态对象 Memento
//    因此编写一个方法返回memento对象
    public Memento saveState(){
        return new Memento(state);
    }
//    通过备忘录对象 进行回复
    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();

    }
}
