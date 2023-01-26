package com.misaka.proxy.staticProxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("使用");
    }
}
