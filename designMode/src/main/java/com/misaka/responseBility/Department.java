package com.misaka.responseBility;

public class Department extends Handler{
    @Override
    public void handler(Request request) {
        if(request.getValue()<2000){
            System.out.println(this.getName()+"处理成功");
        }else {
//            传递
            nextHandler.handler(request);
        }
    }

    public Department(String name) {
        super(name);
    }
}
