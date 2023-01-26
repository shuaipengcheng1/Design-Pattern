package com.misaka.adapter.springMvcDispatch;

public class Client {
    public static void main(String[] args) {
        Dispatch dispatch = new Dispatch();
//        dispatch.doDispatch(new SimpleHandler());
//        dispatch.doDispatch(new AnnotationHandler());
        dispatch.doDispatch(new HttpHandler());
    }
}
