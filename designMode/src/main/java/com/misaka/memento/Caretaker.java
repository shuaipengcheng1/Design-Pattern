package com.misaka.memento;

import java.util.ArrayList;
import java.util.List;
/*
*
* 管理备忘录对象
* */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();
    public void  add(Memento memento){
        mementos.add(memento);
    }
    public Memento get(int index){
      return   mementos.get(index);
    }
}
