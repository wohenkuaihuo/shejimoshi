package com.baniao.abstrFactoryMethod.shixian;

import com.baniao.abstrFactoryMethod.jiekou.Company;
import com.baniao.abstrFactoryMethod.jiekou.NotebookComputer;
import com.baniao.abstrFactoryMethod.jiekou.DesktopPhone;
import com.baniao.abstrFactoryMethod.jiekou.Mobile;
import com.baniao.abstrFactoryMethod.jiekou.NotebookComputer;
import com.baniao.abstrFactoryMethod.jiekou.PersonalComputer;
import com.baniao.abstrFactoryMethod.jiekou.Mobile;

public class CompanyA implements Company {

	@Override
	public DesktopPhone buildDesktopPhone() {
		return new DesktopPhoneA();
	}

	@Override
	public Mobile buildMobile() {
		return new MobileA();
	}

	@Override
	public NotebookComputer buildNotebookComputer() {
		return new NotebookComputerA();
	}

	@Override
	public PersonalComputer buildPersonalComputer() {
		return new PersonalComputerA();
	}

	
}
