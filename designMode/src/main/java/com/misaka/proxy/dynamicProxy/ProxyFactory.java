package com.misaka.proxy.dynamicProxy;

import sun.applet.AppletClassLoader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
*
* 动态代理 JDK代理
* */
public class ProxyFactory {
//    维护一个目标对象
    Object teacherDao;

    public ProxyFactory(Object teacherDao) {
        this.teacherDao = teacherDao;
    }

//    用于返回代理对象给Client
    public Object getProxyInstance(){

     return    Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(), teacherDao.getClass().getInterfaces(), new InvocationHandler() {
         /*
         *
         * 这个方法就是代理方法
         *
         * */
         @Override
         public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
             System.out.println("jdk代理开始");
//             反射机制来调用目标对象的方法 传入目标对象 并且返回该方法的返回值 args就是你外部Client的传入的参数
            Object returnValue =  method.invoke(teacherDao,args);
             return returnValue;
         }
     });
    }
}
