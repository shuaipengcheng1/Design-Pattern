package com.misaka.visitor;

public class Client {
    public static void main(String[] args) {
        Good good = new Good();
        ObjectStructure  structure = new ObjectStructure(new WoMan());
        structure.people.accept(good);
        Bad bad  = new Bad();
        structure.people.accept(bad);

    }
}
