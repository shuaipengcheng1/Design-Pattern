package com.misaka.visitor;

public abstract class Grade {
    public abstract void message();
}



class Good extends Grade{
    @Override
    public void message() {
        System.out.println("Good");
    }
}
class Bad extends Grade
{
    @Override
    public void message() {
        System.out.println("Bad");
    }
}