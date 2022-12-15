package com.misaka.prototype.deepCloneImp;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable,Cloneable {
  private Test test ;
  private Test test2;

    public DeepCloneTarget(Test test, Test test2) {
        this.test = test;
        this.test2 = test2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
