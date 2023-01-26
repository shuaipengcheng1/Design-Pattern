package com.misaka.adapter.springMvcDispatch;

import java.util.ArrayList;
import java.util.List;

public class Dispatch {
//    组合
    List<HandlerAdapter> list = new ArrayList<>();
//    初始化所有的设配器的列表
     public Dispatch(){
         list.add(new HttpHandlerAdapter());
         list.add(new SimpleHandlerAdapter());
         list.add(new AnnotationHandlerAdapter());
     }

     public void doDispatch(Handler handler){
            HandlerAdapter adapter = getAdapter(handler);
//            执行处理方法
            adapter.handle(handler);
     }
//     获取对于handler的adapter
     public HandlerAdapter getAdapter(Handler handler){
         for (HandlerAdapter ha: this.list
              ) {
             if(ha.support(handler)){
//                 获取对应的适配器
                 return ha;
             }

         }
         return  null;

     }
}
