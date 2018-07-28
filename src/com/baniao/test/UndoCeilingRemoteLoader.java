package com.baniao.test;

import com.baniao.Command.CeilingFan;
import com.baniao.Command.Invoker.RemoteControlWithUndo;
import com.baniao.Command.jiekou.CeilingFanHighCommand;
import com.baniao.Command.jiekou.CeilingFanMediumCommand;
import com.baniao.Command.jiekou.CeilingFanOffCommand;

//撤销命令模式的测试
public class UndoCeilingRemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo  remoteControl = new RemoteControlWithUndo();
		CeilingFan ceilingFan = new CeilingFan("living room");
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		
	}

}
