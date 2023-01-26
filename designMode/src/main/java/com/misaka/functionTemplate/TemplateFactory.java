package com.misaka.functionTemplate;
//

/*
 *
 * 模板方法模式
 * 豆浆流程  选择材料----> 添加材料 --->浸泡  --->打碎
 * */
public abstract class TemplateFactory {
    boolean addNo = false;
    public final void make() {
//        模板方法 规定算法流程 final 禁止子类修改

        chooseMateriel();
        addNoMetateriel();
//        钩子
        if(!addNo){
            addMateriel();
        }
        put();
        smash();
    }

    //    添加材料
    abstract void addMateriel();

    //    选择
    abstract void chooseMateriel();

    //浸泡
    abstract void put();

    //    打碎
    abstract void smash();

//    钩子方法
    public void addNoMetateriel(){
//        空实现 由子类操控 如果要加入 则重写 如果不要就不重写
    }
}
