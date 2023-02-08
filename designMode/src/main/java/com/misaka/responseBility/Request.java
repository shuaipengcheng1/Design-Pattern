package com.misaka.responseBility;
/*
* 请求
* */
public class Request {
    private  int id = 0;
    private float value = 0.0f;

    public Request(int id, float value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public float getValue() {
        return value;
    }
}
