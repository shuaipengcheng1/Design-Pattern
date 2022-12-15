package com.misaka.prototype.deepclone;
//让这个类实现克隆接口
public class Sheep implements Cloneable{
    private   int age;
    private   String name;
    private String color;

    public Sheep(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    克隆该实例
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
//        默认方法克隆
        sheep  =(Sheep) super.clone();
        return sheep;
    }
}
