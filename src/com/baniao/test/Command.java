package com.baniao.test;

import com.baniao.Command.Light;
import com.baniao.Command.Invoker.Invoker;
import com.baniao.Command.jiekou.LightOnCommand;

//基本命令模式的调用
public class Command {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Light light = new Light();
		LightOnCommand lighton = new LightOnCommand(light);
		invoker.setCommand(lighton);
		invoker.action();
	}

}
