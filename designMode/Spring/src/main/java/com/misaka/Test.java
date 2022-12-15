package com.misaka;

public class Test {
    private int id = 10;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Test() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name="Test";

}
