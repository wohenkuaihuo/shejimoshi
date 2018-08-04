package com.baniao.state;

//没有硬币状态
public class NoQuarterState implements State {
	
	//具体状态类持有对象的引用
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned ,but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");

	}

}
