package com.misaka.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoIterator implements Iterator {
    List<Department> departments;
    int index =-1;

    public InfoIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public Object next() {

        return departments.get(index);
    }

    @Override
    public boolean hasNext() {
        if(index>=departments.size()-1){
            return false;
        }else {
            index++;
            return true;
        }

    }
}
