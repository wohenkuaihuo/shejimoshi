package com.baniao.test;

import java.util.Arrays;

import com.baniao.template.shixian.Duck;
//测试排序模板方法
public class TemplateSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = {new Duck("a",8),new Duck("b",2),new Duck("c",7),new Duck("d",2),new Duck("e",10),new Duck("f",2)};
		System.out.println("Before Sorting ");
		display(ducks);
		Arrays.sort(ducks);
		System.out.println("\nafter sorting");
		display(ducks);

	}
	
	public static void display(Duck[] ducks) {
		for(int i=0;i<ducks.length;i++) {
			System.out.println(ducks[i]);
		}
	}

}
