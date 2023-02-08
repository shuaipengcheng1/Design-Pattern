package com.misaka.responseBility;

public class Client {
    public static void main(String[] args) {
        Handler colleage = new Colleage("院长");
        Handler department = new Department("部门");
        Request request = new Request(1,1200);

//        设置colleage的下一个处理者
        colleage.setNextHandler(department);

        colleage.handler(request);

    }
}
