package com.misaka.adapter.springMvcDispatch;

public interface Handler {
}

class SimpleHandler implements Handler{
    public void SimpleDispatch(){
        System.out.println("普通转发");
    }
}

class AnnotationHandler implements Handler{
    public void AnnotationDispatch(){
        System.out.println("注释转发");
    }
}
class HttpHandler implements Handler{
    public void HttpDispatch(){
        System.out.println("http转发");
    }
}