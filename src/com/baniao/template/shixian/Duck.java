package com.baniao.template.shixian;

public class Duck implements Comparable<Object> {

	
	String name;
	int weight;
	
	public Duck(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name+"weights:"+weight;
	}
	
	@Override
	public int compareTo(Object object) {
		Duck otherDuck = (Duck)object;
		if(this.weight<otherDuck.weight) {
			return -1;
		}else if(this.weight == otherDuck.weight) {
			return 0;
		}else {
			return 1;
		}
	}

}
