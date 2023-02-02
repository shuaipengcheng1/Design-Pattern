package com.misaka.memento.game;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Boss origin = new Boss();
        Caretaker caretaker = new Caretaker();
        origin.setState(1, 2, 3);
        origin.getState();
//        备份
        Boss boss1 = (Boss) origin.clone();
//       管理
        caretaker.add(boss1);

        origin.setState(1, 2, 2);
        origin.getState();
        //        备份
        Boss boss2 = (Boss) origin.clone();
//       管理
        caretaker.add(boss2);

//        恢复
        origin.getStateFromBoss(boss1);
        origin.getState();




    }

}
