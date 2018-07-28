package com.baniao.Command.jiekou;

import com.baniao.Command.Light;
//灯打开命令
public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execuse() {
		light.on();

	}

	@Override
	public void undo() {
		light.off();
		
	}

}
