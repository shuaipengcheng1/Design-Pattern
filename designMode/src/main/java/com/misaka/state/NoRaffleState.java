package com.misaka.state;
/*
* 不能抽奖状态 即还没扣分
* */
public class NoRaffleState  implements State{
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣50分");
        /*设置为可以抽奖*/
        activity.setState(new CanRaffleState(activity));
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("先扣分数哦");

    }
}
