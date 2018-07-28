package com.baniao.Command.jiekou;

import com.baniao.Command.Light;
//灯关闭命令
public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execuse() {
		light.off();

	}
	
    @Override
    public void undo() {
    	light.on();
    }

}
