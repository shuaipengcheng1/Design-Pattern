package com.misaka.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Boss> bosses = new ArrayList<>();

    public void add(Boss boss) {
        bosses.add(boss);
    }

    public Boss get(int index) {
        return bosses.get(index);

    }
}
