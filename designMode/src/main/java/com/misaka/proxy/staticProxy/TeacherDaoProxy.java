package com.misaka.proxy.staticProxy;

public class TeacherDaoProxy implements ITeacherDao {
   private ITeacherDao teacherDao ;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
//    代理对象中 使用目标对象的方法
//        在这里可以加强调用 可以准备数据等等
        teacherDao.teach();
    }
}
