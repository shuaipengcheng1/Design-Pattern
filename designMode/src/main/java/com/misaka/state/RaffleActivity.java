package com.misaka.state;
/*
* 相当于 context 维护所有的状态对象 并且提供可以修改状态的方法
* */
public class RaffleActivity {
//    当前状态
    private State state;
// 所有状态
    NoRaffleState noRaffleState;
    DispenseOutState dispenseOutState;
    CanRaffleState canRaffleState;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    DispenseState dispenseState;

//    奖品总数
    int count;

    public RaffleActivity( int count) {
        this.noRaffleState = new NoRaffleState(this);
        this.dispenseOutState = new DispenseOutState(this);
        this.canRaffleState = new CanRaffleState(this);
        this.dispenseState = new DispenseState(this);
        this.count = count;
//        默认为不能抽奖状态
        this.state = noRaffleState;
    }

    public void deduce(){
        this.state.deduceMoney();
    }
    public void reffle(){
//        抽奖成功
        if(this.state.raffle()){
//            领取奖品
            this.state.dispensePrice();
        }
    }

}
