package com.misaka.proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        目标对象
        ITeacherDao teacherDao = new TeacherDao();
//        传入到代理对象中
        ProxyFactory factory = new ProxyFactory(teacherDao);
//      接受代理对象 并且转型
        ITeacherDao proxy= (ITeacherDao)factory.getProxyInstance();
        proxy.teach();
//        反编译 获取对象
      T o= (T) T.class.newInstance();
o.t();

    }

}

class T{
    public int i;

    public T() {
    }

    public T(int i) {
        this.i = i;
    }
    public void t(){
        System.out.println(this.i);
    }
}
