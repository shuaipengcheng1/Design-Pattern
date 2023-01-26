package com.misaka.adapter.springMvcDispatch;

public interface HandlerAdapter {
    boolean support(Handler handler);
     void handle(Handler handler);
}


//转换器
class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean support(Handler handler) {
        return (handler instanceof SimpleHandler);
    }

    @Override
    public void handle(Handler handler) {
        SimpleHandler simpleHandler=(SimpleHandler)handler;
        simpleHandler.SimpleDispatch();
    }
}
class HttpHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean support(Handler handler) {
        return (handler instanceof HttpHandler);
    }

    @Override
    public void handle(Handler handler) {
        HttpHandler httpHandler=(HttpHandler)handler;
        httpHandler.HttpDispatch();
    }
}
class AnnotationHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean support(Handler handler) {
        return (handler instanceof AnnotationHandler);
    }

    @Override
    public void handle(Handler handler) {
        AnnotationHandler annotationHandler=(AnnotationHandler)handler;
        annotationHandler.AnnotationDispatch();

    }
}