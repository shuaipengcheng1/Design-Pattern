package com.misaka.command;

/*
*
* 命令者
* */
public class RemoteController {
  private   Command[] onCommands ;

   private Command[] offCommands ;
   private Command undoCommand;

    public RemoteController(int num) {
        this.onCommands = new Command[num];
        this.offCommands = new Command[num];
        for (int i = 0; i <num ; i++) {
            onCommands[i]=  new noCommand();
            offCommands[i]=  new noCommand();

        }

    }

   public void onTouch(int num){
       onCommands[num].excute();
       //记录操作用于撤销
       undoCommand = onCommands[num];
   }
   public void offTouch(int num){
       offCommands[num].excute();
       //记录操作用于撤销
       undoCommand = offCommands[num];

   }
   public void setCommand(int num,Command on,Command off){
       onCommands[num] = on;
       offCommands[num] = off;
   }
   public void undo(){
       undoCommand.undo();
   }
}
