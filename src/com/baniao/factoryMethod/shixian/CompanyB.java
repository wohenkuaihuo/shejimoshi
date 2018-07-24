package com.baniao.factoryMethod.shixian;

import com.baniao.factoryMethod.jiekou.Company;
import com.baniao.factoryMethod.jiekou.Product;

public class CompanyB implements Company {

	@Override
	public Product buildProduct() {
		return new ProductB();
		
	}

}
