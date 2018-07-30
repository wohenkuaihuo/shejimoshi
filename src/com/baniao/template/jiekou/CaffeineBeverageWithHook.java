package com.baniao.template.jiekou;

public abstract class CaffeineBeverageWithHook {
	//准备食谱
	public void prepareRecipe() {
		boilWater();//煮水
		brew();//冲泡
		pourInCup();//倒入杯中
		if(customerWantsCondiments()) {//如果客户想要添加调料
			addCondiments();//添加调料
		}
	}
	//钩子
	public  boolean customerWantsCondiments() {
		
		return true;
	}

	public  void pourInCup() {
		System.out.println("pouring into cup");
		
	}

	public abstract void brew();
	
	public abstract void addCondiments();

	public  void boilWater() {
		System.out.println("Boiling water");
		
	}
	
	

}
