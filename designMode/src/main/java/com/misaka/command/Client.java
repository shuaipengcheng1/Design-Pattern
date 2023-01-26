package com.misaka.command;
/*
*
* 用户
* */
public class Client {
    public static void main(String[] args) {
      RemoteController remoteController=  new RemoteController(5);
remoteController.setCommand(0,new lightOn(),new lightOff());
        remoteController.setCommand(1,new TvOn(),new TvOff());

remoteController.onTouch(0);
//撤销
remoteController.undo();

        remoteController.onTouch(1);

    }
}
