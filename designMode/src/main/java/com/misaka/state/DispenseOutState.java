package com.misaka.state;

public class DispenseOutState implements State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("活动已经结束");

    }

    @Override
    public boolean raffle() {
        System.out.println("活动已经结束");

        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("活动已经结束");


    }
}
