package com.baniao.state;

import java.util.Random;

public class HasQuarterState implements State {
	
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("you can't insert another quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter turned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned....");
		int winner  = randomWinner.nextInt(10);
		if((winner == 0)&&(gumballMachine.getCount()>0)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");

	}

}
