package com.misaka.FlyWeight;

import java.util.HashMap;

public class FlyWeightFactory {
//    聚合 对象池
    private HashMap<String,FlyWeight> flyWeightHashMap = new HashMap<>();
    public FlyWeight getFlyWeight(String str){
        if(flyWeightHashMap.containsKey(str)){
//            如果包含
            return flyWeightHashMap.get(str);
        }else {
//            没有就新建并且返回

            flyWeightHashMap.put(str,new ConcreteFlyWeight(str));
            return flyWeightHashMap.get(str);
        }
    }
}
