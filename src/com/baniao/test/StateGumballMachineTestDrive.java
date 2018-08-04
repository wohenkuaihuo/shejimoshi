package com.baniao.test;

import com.baniao.state.GumballMachine;

public class StateGumballMachineTestDrive {
	
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(100);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			
		System.out.println(gumballMachine);
		
		System.out.println(gumballMachine.getState());
		
		System.out.println(gumballMachine.getWinnerState());
		
		
			
		
	}

}
