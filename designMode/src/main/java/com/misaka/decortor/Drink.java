package com.misaka.decortor;

import java.io.*;

public abstract   class Drink {
    String des="";
    float price = 0.0f;

    public float getPrice() {
        System.out.println("////");
        return price;
    }


    public void setPrice(float f) {
        price = f;
    }


    public String getDes() {
        return des;
    }

    public void setDes(String str) {
        this.des = str;
    }
    abstract float cost();

//    public static void main(String[] args) throws FileNotFoundException {
////        装饰者模式 inputStream为 主体 Drink
////         FileInputStream 为主体的实现例如 EsCoffee
////        FilterInputStream 继承  inputStream为装饰者
////        DataInputStream 继承 FilterInputStream  为具体装饰者
//        InputStream inputStream = new DataInputStream(new FileInputStream(""));
//
//    }
}
