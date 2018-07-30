package com.baniao.test;

import com.baniao.template.shixian.CoffeeWithHook;

public class TemplateBeverageTestDrive {

	public static void main(String[] args) {
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		System.out.println("\nMaking coffee..");
		coffeeHook.prepareRecipe();
	}

}
