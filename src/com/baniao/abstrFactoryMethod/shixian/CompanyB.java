package com.baniao.abstrFactoryMethod.shixian;

import com.baniao.abstrFactoryMethod.jiekou.Company;
import com.baniao.abstrFactoryMethod.jiekou.Computer;
import com.baniao.abstrFactoryMethod.jiekou.TelePhone;

public class CompanyB implements Company {

	@Override
	public Computer buildComputer(String Parameter) {
		if (Parameter.equals("个人电脑")) return new PersonalComputer();
		else if (Parameter.equals("笔记本电脑")) return new NotebookComputer();
		else return null;
	}

	@Override
	public TelePhone buildTelePhone(String Parameter) {
		if (Parameter.equals("座机电话")) return new DesktopPhone();
		else if (Parameter.equals("手机")) return new Mobile();
		else return null;
	}

}
