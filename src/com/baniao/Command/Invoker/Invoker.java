package com.baniao.Command.Invoker;

import com.baniao.Command.jiekou.Command;

//调用者对象
public class Invoker {
	
	private Command command;
	
	//设置命令
	public void setCommand(Command command){
		this.command = command;
	}
	//执行命令
	public void action() {
		this.command.execuse();
	}

}
