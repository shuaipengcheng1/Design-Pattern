package com.misaka.visitor;

public abstract class People {
    public abstract void accept(Grade grade);
}


class Man extends People{
    String string = "Man";
    @Override
    public void accept(Grade grade) {
        System.out.print(this.string);
        grade.message();
    }
}

class WoMan extends People{
    String string = "WoMan";
    @Override
    public void accept(Grade grade) {
        System.out.print(this.string);
        grade.message();
    }
}