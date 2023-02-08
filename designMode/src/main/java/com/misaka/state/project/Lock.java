package com.misaka.state.project;

public class Lock {
    private static class Inter{
        public static Lock Inter= new Lock();
    }
    private Lock(){}
    public static Lock getInstence(){
        return Inter.Inter;
    }

}
