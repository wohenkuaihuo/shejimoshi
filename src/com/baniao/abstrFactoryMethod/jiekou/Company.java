package com.baniao.abstrFactoryMethod.jiekou;

//抽象工厂类
public interface Company {
	//构建生产座机方法
	public DesktopPhone buildDesktopPhone();
	
	//构建生产移动电话方法
	public Mobile buildMobile();
	
	//构建生产笔记本电脑方法
	
	public NotebookComputer buildNotebookComputer();
	
	//构建生产个人电脑方法
	public PersonalComputer buildPersonalComputer();
	

}
