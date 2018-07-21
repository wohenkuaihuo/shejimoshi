package com.baniao.factoryMethod.shixian;

import com.baniao.factoryMethod.jiekou.Product;

public class ProductB implements Product {

public String productType = "ProductB";
	
	private String productParameter = "B";

	@Override
	public String getProductType() {
		return productType;
	}
	
	public String getParameter() {
		return productParameter;
	}

	@Override
	public void doUse() {
		System.out.println("这是productB实现的功能！");
	}
}
