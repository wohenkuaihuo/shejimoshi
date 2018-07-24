package com.baniao.test;

import com.baniao.simpleFactoryMethod.shixian.Factory;

public class SimpleFactoryMethodTest {

	public static void main(String[] args) {

		Factory factory = new Factory();
		factory.createProduct("ProductA");
		factory.createProduct("productB");
	}

}
