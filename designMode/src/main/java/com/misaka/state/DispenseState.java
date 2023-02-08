package com.misaka.state;

public class DispenseState implements State{
    RaffleActivity activity;
    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("领取阶段不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("领取阶段不能抽奖");
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("领取成功!!");
        activity.count --;
        activity.setState(new NoRaffleState(activity));
        if(activity.count==0){
            System.out.println("活动已经结束");
            activity.setState(new DispenseOutState(activity));
        }







    }
}
