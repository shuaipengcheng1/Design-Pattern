package com.misaka.state.project;

/*
 * 单例模式
 * */
public class Activity {
    //    管理所有的状态


    private OrderState orderState = new OrderState(this);
    private CheckState checkState = new CheckState(this);
    private PublishState publishState = new PublishState(this);
    private CallState callState = new CallState(this);
    private CallNoOneState callNoOneState = new CallNoOneState(this);
    private FinishState finishState = new FinishState(this);
    private State state;


    //    private   static class Instence {
//        //        单例
//        public static Activity instence = new Activity();
//
//
//    }
//    public static Activity getInstance(){
//        System.out.println(Instence.instence);
//        return Instence.instence;
//    }
//
    public Activity() {
//       默认状态
        this.state = new OrderState(this);
    }

    //
    public void setState(State state) {
        this.state = state;

    }

    boolean isPay = false;
    class BeforePay extends AbstractState implements Runnable{
        public BeforePay(Activity activity) {
            super(activity);
        }
        @Override
        public void run() {
            synchronized (Lock.getInstence()){
                System.out.println("等待");
                while (!isPay){
                    try {
                        Lock.getInstence().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("付款了");
            }
        }
        @Override
        public void pay() {
            this.run();
        }
    }
    //    模板方法模式
    public void templete() throws InterruptedException {
        this.state.order();
//        审核
        if (state.check()) {
//                发布
            state.publish();
            setState(new BeforePay(this));
            synchronized (Lock.getInstence()) {
                Thread beforePay = new Thread((Runnable) this.state); //这样可以释放锁给main线程
                beforePay.start();
//                BeforePay beforePay = new BeforePay(this); // 这样不能释放锁 会造成阻塞
//                beforePay.run();
                System.out.println("付款中");
                Thread.sleep(4000);
                Thread Pay = new Thread(() -> {
                    synchronized (Lock.getInstence()) {
                        System.out.println("付款");
                        isPay = true;
                        Lock.getInstence().notify();
                        System.out.println("付款了");
//                        修改状态为完成
                        setState(new FinishState(this));
                    }
                });
                Pay.start();
                state.finish();
            }
        } else {
            state.finish();
        }
    }
}


