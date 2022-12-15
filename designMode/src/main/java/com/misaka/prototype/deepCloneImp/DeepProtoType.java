package com.misaka.prototype.deepCloneImp;

import java.io.*;

public class DeepProtoType {
   public String string;
 public    DeepCloneTarget deepCloneTarget ;

    public DeepProtoType(String string, DeepCloneTarget deepCloneTarget) {
        this.string = string;
        this.deepCloneTarget = deepCloneTarget;
    }
//深拷贝
//    方法1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepProtoType deep = null;
//        这里对基本数据类型和String类型的成员变量deepclone
        deep = (DeepProtoType)super.clone();
//        这里对引用属性重新赋值
        deep.deepCloneTarget =(DeepCloneTarget) deepCloneTarget.clone();



        return deep;
    }

//    通过序列化
    public Object deepClone() throws IOException {
        /*output 写 input 读*/
        ByteArrayOutputStream bos = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
//            序列化
            bos = new ByteArrayOutputStream();
            objectOutputStream=new ObjectOutputStream(bos);
//            将当前对象作为对象流的形式发送出去
            objectOutputStream.writeObject(this);
//            反序列化 读取byteArray
            byteArrayInputStream =new ByteArrayInputStream(bos.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
//          返会一个对象
           return objectInputStream.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            bos.close();
            objectInputStream.close();
            byteArrayInputStream.close();
            objectOutputStream.close();
        }
        return  null;
    }
}

