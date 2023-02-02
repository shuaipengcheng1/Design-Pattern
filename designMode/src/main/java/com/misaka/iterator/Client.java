package com.misaka.iterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
//        创建计算机学院
        Computer computer = new Computer();
//        信息学院
        Info info = new Info();
//        遍历
        Iterator computerIterator = computer.crateIterator();
        for (; computerIterator.hasNext(); ) {
            Department item = (Department) computerIterator.next();
            System.out.println(item.name);

        }
        Iterator infoIterator = info.crateIterator();
        for (; infoIterator.hasNext(); ) {
            Department item = (Department) infoIterator.next();
            System.out.println(item.name);
        }
    }
}
