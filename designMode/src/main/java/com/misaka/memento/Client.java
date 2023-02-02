package com.misaka.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        // 状态1
        originator.setState("状态1");
//        保存
        Memento memento = originator.saveState();
//     添加到列表中
        caretaker.add(memento);
        originator.setState("状态2");
        System.out.println(originator.getState()); // 状态2
        // 状态2保存
        Memento memento1= originator.saveState();
        caretaker.add(memento1);

//        还原 1
        originator.getStateFromMemento(caretaker.get(0));

        System.out.println(originator.getState()); // 状态1
//        还原 2
        originator.getStateFromMemento(caretaker.get(1));

        System.out.println(originator.getState()); // 状态2

    }
}
