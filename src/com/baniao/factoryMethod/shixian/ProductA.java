package com.baniao.factoryMethod.shixian;

import com.baniao.factoryMethod.jiekou.Product;

public class ProductA implements Product {
	
	public String productType = "ProductA";
	
	private String productParameter = "A";

	@Override
	public String getProductType() {
		return productType;
	}
	
	public String getParameter() {
		return productParameter;
	}

	@Override
	public void doUse() {
		System.out.println("这是productA实现的功能！");
	}

}
