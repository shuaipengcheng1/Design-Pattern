package com.misaka.responseBility;

public class Colleage extends Handler{
    @Override
    public void handler(Request request) {
        if(request.getValue()<1000){
            System.out.println(this.getName()+"处理成功");
        }else {
//            传递
            this.nextHandler.handler(request);
        }
    }

    public Colleage(String name) {
        super(name);
    }
}
