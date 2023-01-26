package com.misaka.proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
//        获取代理对象 并且强转
        TeacherDao proxy =(TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
//执行代理对象的方法 触发interceptor 从而实现动态代理
        proxy.teach();
    }
}
