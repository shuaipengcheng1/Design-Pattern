package com.misaka.iterator;

import java.util.Iterator;

public class Computer implements Collage{
    String name="计算机";
    Department[] department;

    public Computer() {
        this.department = new Department[5];
        department[0] = new Department("计算机");
        department[1] = new Department("计算机");
        department[2] = new Department("计算机");
        department[3] = new Department("计算机");

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Iterator crateIterator() {
        return new ComputerIterator(department);
    }
}
