package com.misaka.iterator;

import java.util.Iterator;

public class ComputerIterator implements Iterator {
    Department[] departments;
    int position = 0;

    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(departments[position]==null || position>= departments.length){
            return false;

        }else {
            return true;
        }
    }

    @Override
    public Object next() {
       Department department= departments[position];
       position++;
        return department;
    }
}
