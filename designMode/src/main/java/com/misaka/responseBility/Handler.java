package com.misaka.responseBility;

public abstract class Handler {
     Handler nextHandler;

    private String name;

    public String getName() {
        return name;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler(String name) {
        this.name = name;
    }

    public abstract void handler(Request request);
}
