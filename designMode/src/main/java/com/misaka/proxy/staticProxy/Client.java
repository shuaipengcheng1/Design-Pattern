package com.misaka.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
//        使用代理对象 将目标对象[即被代理对象] 传入到代理对象中 进行调用 Client不直接使用
        ITeacherDao teacherDao = new TeacherDaoProxy(new TeacherDao());
        teacherDao.teach();
    }
}
