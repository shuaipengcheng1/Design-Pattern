package com.misaka.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Info implements Collage{
    String name="信息";
    List<Department> department ;

    public Info() {
        this.department = new ArrayList<>();
        department.add(new Department("信息"));
        department.add(new Department("信息"));
        department.add(new Department("信息"));
        department.add(new Department("信息"));

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Iterator crateIterator() {
        return new InfoIterator(department);
    }
}
