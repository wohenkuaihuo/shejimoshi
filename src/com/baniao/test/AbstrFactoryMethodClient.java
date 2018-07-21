package com.baniao.test;

import com.baniao.abstrFactoryMethod.jiekou.Company;
import com.baniao.abstrFactoryMethod.jiekou.Computer;
import com.baniao.abstrFactoryMethod.jiekou.TelePhone;
import com.baniao.abstrFactoryMethod.shixian.CompanyA;

public class AbstrFactoryMethodClient {

	public static void main(String[] args) {
		Company company1 = new CompanyA();
		Computer computer1 = company1.buildComputer("个人电脑");
		computer1.doUse();
		Computer computer2 = company1.buildComputer("笔记本电脑");
		computer2.doUse();
		TelePhone telephone1 = company1.buildTelePhone("座机电话");
		telephone1.doUse();
		TelePhone telephone2 = company1.buildTelePhone("手机");
		telephone2.doUse();
	}

}
