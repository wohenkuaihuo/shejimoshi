package com.baniao.Command.Invoker;

import com.baniao.Command.jiekou.Command;
import com.baniao.Command.jiekou.NoCommand;

public class RemoteControlWithUndo {
	Command[] onCommands;  //打开命令
	Command[] offCommands; //关闭命令
	Command undoCommand;//撤销命令
	
	//初始化命令
	public RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	//设置命令
	public void setCommand(int slot,Command onCommand,Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	//打开按钮按下时
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execuse();
		undoCommand = onCommands[slot];
		
	}
	//关闭按钮按下时
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execuse();
		undoCommand = offCommands[slot];
	}
	//撤销按钮按下时
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public String toString() {
		return undoCommand.toString();
	}

}
