package com.misaka.proxy.dynamicProxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("run");
    }
}
