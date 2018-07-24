package com.baniao.simpleFactoryMethod.shixian;

import com.baniao.simpleFactoryMethod.Product;

public class Factory {
	public Product createProduct(String product) {
		if(!"".equals(product)) {
			if("ProductA".equals(product)) {
				return new ProductA();
			}else if("productB".equals(product)) {
				return new ProductB();
			}
				
		}
		return null;
	}

}
