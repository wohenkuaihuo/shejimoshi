package com.baniao.abstrFactoryMethod.shixian;

import com.baniao.abstrFactoryMethod.jiekou.TelePhone;

public class Mobile extends TelePhone {
@Override
public void doUse() {
	System.out.println("这是移动电话的功能");
}
}
