package com.misaka.command;
/*
* 命令
*
* */
public interface Command {
    void excute();
    void undo();
}
class lightOn implements Command{
    Light light  = Light.L.instance;
    @Override
    public void excute() {
        light.on();


    }

    @Override
    public void undo() {
        light.off();

    }
}

class lightOff implements Command{
    Light light  = Light.L.instance;

    @Override
    public void excute() {
       light.off();
    }

    @Override
    public void undo() {
        light.on();

    }
}
class noCommand implements Command{
//    用于初始化

    @Override
    public void excute() {

    }

    @Override
    public void undo() {

    }
}
class TvOn implements Command{
    Tv tv  = Tv.L.instance;

    @Override
    public void excute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();

    }
}
class TvOff implements Command{
    Tv tv  = Tv.L.instance;

    @Override
    public void excute() {
        tv.off();

    }

    @Override
    public void undo() {
        tv.on();

    }
}