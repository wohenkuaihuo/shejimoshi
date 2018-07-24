package com.baniao.test;

import com.baniao.factoryMethod.jiekou.Company;
import com.baniao.factoryMethod.jiekou.Product;
import com.baniao.factoryMethod.shixian.CompanyA;
import com.baniao.factoryMethod.shixian.CompanyB;

public class FactoryMethodClient {

	public static void main(String[] args) {
		Company companyA = new CompanyA();
		Company companyB = new CompanyB();
		
		//根据传入的参数得到productA
		Product productA = companyA.buildProduct();
		productA.doUse();
		//根据传入的参数得到productB
		Product productB = companyB.buildProduct();
		productB.doUse();
		
		
		
	}

}
