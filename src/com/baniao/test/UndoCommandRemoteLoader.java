package com.baniao.test;

import com.baniao.Command.Light;
import com.baniao.Command.Invoker.RemoteControlWithUndo;
import com.baniao.Command.jiekou.LightOffCommand;
import com.baniao.Command.jiekou.LightOnCommand;

//撤销命令模式的调用
public class UndoCommandRemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		remoteControl.setCommand(0, lightOn, lightOff);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		
		
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		
		
	}

}
