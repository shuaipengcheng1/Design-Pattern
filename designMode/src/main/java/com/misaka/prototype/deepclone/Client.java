package com.misaka.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep  = new Sheep(10,"tom","白色");
//       原型模式来解决克隆羊问题
        Sheep sheep1= (Sheep)sheep.clone();
    }
}
