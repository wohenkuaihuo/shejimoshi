package com.baniao.state;

//定义一个状态的共同接口
public interface State {
	//投入硬币
	public void insertQuarter();
	//退出硬币
	public void ejectQuarter();
	//转动按钮
	public void turnCrank();
	//分配糖果
	public void dispense();

}
