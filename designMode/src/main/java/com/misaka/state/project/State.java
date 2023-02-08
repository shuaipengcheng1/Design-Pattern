package com.misaka.state.project;

/*
 * 流程 订单生成  审核 发布 接单 待付款 已付款 完结
 *      订单生成 审核 审核失败 完结
 *      订单生产 审核 发布 无人接听 完结
 * 状态类    订单生成 审核 审核失败 发布 接单 待付款 已付款 完结 无人接听
 * */
public interface State {
    //    发布
    void order();

    //    审核
    boolean check();

    //    发布
    void publish() throws InterruptedException;

    // 接单
    void receiveOrder();

    //    打电话
    boolean call();

    // 付款
    void pay();

    //    结束
    void finish();

}
