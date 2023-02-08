package com.misaka.state;
/*
*
* 管理状态的抽象接口
* */
public interface State {
//    扣钱
    void deduceMoney();
//    抽奖
    boolean raffle();
//    发放奖品
    void dispensePrice();
}
