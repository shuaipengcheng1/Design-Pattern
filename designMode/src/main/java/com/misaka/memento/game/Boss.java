package com.misaka.memento.game;

import com.misaka.prototype.deepclone.Sheep;

/*
* 结合原型模式来节省内存 原型模式就不需要Memento了
* */
public class Boss implements Cloneable{
    private int atk;
    private int ap;
    private int hp;
    public void setState(int atk,int ap,int hp){
        this.atk = atk;
        this.ap = ap;
        this.hp = hp;
    }
    public void getState(){
        System.out.println(atk);
        System.out.println(ap);
        System.out.println(hp);


    }

    public void getStateFromBoss(Boss boss){
        this.atk =boss.atk;
        this.ap = boss.ap;
        this.hp = boss.hp;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Boss boss = null;
//        默认方法克隆
        boss  =(Boss) super.clone();
        return boss;

    }
}
