package com.baniao.factoryMethod.shixian;

import com.baniao.factoryMethod.jiekou.Company;
import com.baniao.factoryMethod.jiekou.Product;

public class CompanyA implements Company {

	@Override
	public Product buildProduct(String paramter) {
		//根据传入的参数，决定生产哪个具体的产品
		if("A".equals(paramter)) return new ProductA();
		else if("B".equals(paramter)) return new ProductB();
		else return null;
	}

}
