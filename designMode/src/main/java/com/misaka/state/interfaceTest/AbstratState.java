package com.misaka.state.interfaceTest;

public class AbstratState implements State{
    /*
    *
    * 全部空实现 交给子类重写 并且子类可以遵循接口隔离原则
    * */
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}
class A extends AbstratState{
//    这里我只重写了a 方法 b c 方法交给其他的类来实现
    @Override
    public void a() {
        super.a();
    }
}
class C{
    public static void main(String[] args) {
        AbstratState abstratState = new A();
        abstratState.b();
    }
}