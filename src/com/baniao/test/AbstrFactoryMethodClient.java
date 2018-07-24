package com.baniao.test;

import com.baniao.abstrFactoryMethod.jiekou.Company;
import com.baniao.abstrFactoryMethod.shixian.CompanyA;
import com.baniao.abstrFactoryMethod.shixian.CompanyB;

public class AbstrFactoryMethodClient {

	public static void main(String[] args) {
		Company company1 = new CompanyA();
		Company company2 = new CompanyB();
		company1.buildDesktopPhone().doUse();;
		company1.buildMobile().doUse();
		company1.buildNotebookComputer().doUse();
		company1.buildPersonalComputer().doUse();
		
		company2.buildDesktopPhone().doUse();
		company2.buildMobile().doUse();
		company2.buildNotebookComputer().doUse();
		company2.buildPersonalComputer().doUse();
		
		
		
	}

}
