package com.baniao.test;

import com.baniao.factoryMethod.jiekou.Company;
import com.baniao.factoryMethod.jiekou.Product;
import com.baniao.factoryMethod.shixian.CompanyA;

public class FactoryMethodClient {

	public static void main(String[] args) {
		Company company = new CompanyA();
		
		//根据传入的参数得到productA
		Product productA = company.buildProduct("A");
		productA.doUse();
		//根据传入的参数得到productB
		Product productB = company.buildProduct("B");
		productB.doUse();
		
		
		
	}

}
