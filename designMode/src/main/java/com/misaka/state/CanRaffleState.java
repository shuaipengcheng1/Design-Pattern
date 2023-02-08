package com.misaka.state;

public class CanRaffleState implements State{
    RaffleActivity activity;
    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣过了!");
    }

    @Override
    public boolean raffle() {
        int no = (int)Math.ceil(Math.random()*100);
        if(no<20){
            System.out.println("抽奖成功!");
//            设置为发放奖品状态
            activity.setState(new DispenseState(activity));
            return true;
        }
        System.out.println("没抽到");
//        设置为不能抽奖状态
        activity.setState(new NoRaffleState(activity));
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("先抽奖哦");
    }
}
