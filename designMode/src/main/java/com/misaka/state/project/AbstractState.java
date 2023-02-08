package com.misaka.state.project;

import com.sun.org.apache.xpath.internal.operations.Or;

public  abstract class AbstractState implements State {
    /*
    * 该抽象类用于实现接口隔离 空实现 全部为不能执行
    * */
//    单例模式
    public Activity activity  ;

    @Override
    public void order() {
        System.out.println("还不能下单");
    }

    public AbstractState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean check() {
        System.out.println("请先下单");
        return false;
    }

    @Override
    public void publish() throws InterruptedException {
        System.out.println("请先审核");
    }

    @Override
    public void receiveOrder() {
        System.out.println("请先发布");
    }

    @Override
    public boolean call() {
        System.out.println("请先发布");
        return false;
    }

    @Override
    public void pay() {
        System.out.println("请先发布");

    }

    @Override
    public void finish() {
        System.out.println("请先下单");

    }
}
// * 状态类    订单生成 审核 审核失败 发布 接单 待付款 已付款 完结 无人接听
class OrderState extends AbstractState{


    public OrderState(Activity activity) {
        super(activity);


    }

    @Override
    public void order() {
        System.out.println("生成订单咯");
//修改状态为 审核


      activity.setState(new CheckState(activity));
    }
}
class CheckState extends AbstractState{



    public CheckState(Activity activity) {
        super(activity);



    }
    @Override
    public boolean check() {
//       百分之50的概率审核成功
        int num  = (int) Math.ceil(Math.random()*100);
        System.out.println(num);
        if(num<50){
            System.out.println("审核pass");
            activity.setState(new PublishState(activity));
            return true;
        }
        System.out.println("审核失败 请重新下单");
        activity.setState(new FinishState(activity));
        return false;
    }
}

class PublishState extends AbstractState{



    public PublishState(Activity activity) {
        super(activity);



    }

    @Override
    public void publish() throws InterruptedException {
        System.out.println("发布罗");
//        付款前
    }
}

class CallState extends AbstractState{
    public CallState(Activity activity) {
        super(activity);
    }
}
class CallNoOneState extends AbstractState{
    public CallNoOneState(Activity activity) {
        super(activity);
    }
}
class FinishState extends AbstractState{
    public FinishState(Activity activity) {
        super(activity);
    }
    @Override
    public void order() {
        super.order();
    }

    @Override
    public boolean check() {
        return super.check();
    }

    @Override
    public void publish() throws InterruptedException {
        super.publish();
    }

    @Override
    public void receiveOrder() {
        super.receiveOrder();
    }

    @Override
    public boolean call() {
        return super.call();
    }

    @Override
    public void pay() {
        super.pay();
    }

    @Override
    public void finish() {
        System.out.println("结束啦");
    }
}

