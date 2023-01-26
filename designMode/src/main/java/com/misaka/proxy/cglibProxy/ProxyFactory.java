package com.misaka.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /*
    * 当代理对象调用方法的时候 就会触发 这个intercept方法
    * */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 开始");
//        这里还是通过反射调用方法 和动态代理一样
      Object returnValue=  method.invoke(target,args);
      System.out.println("cglib over");
        return returnValue;
    }
    /*target的代理对象*/
    public Object getProxyInstance(){
//        创建一个工具类
       Enhancer enhancer= new Enhancer();
//        设置父类
        enhancer.setSuperclass(target.getClass());
//        设置回调函数
        enhancer.setCallback(this);
//        创建子类对象 即代理对象
        return enhancer.create();

    }
}
