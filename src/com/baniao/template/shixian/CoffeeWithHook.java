package com.baniao.template.shixian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.baniao.template.jiekou.CaffeineBeverageWithHook;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	
	public void brew() {
		System.out.println("driping coffee through filter");

	}

	
	public void addCondiments() {
		System.out.println("Adding sugar and Milk");

	}
	//覆盖父类的方法实现钩子
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		answer = in.readLine();
		}catch(IOException ioe) {
			System.out.println("IO error trying to read your answer");
			
		}
		if(answer == null) {
			return "no";
		}
		return answer;
	}

}
