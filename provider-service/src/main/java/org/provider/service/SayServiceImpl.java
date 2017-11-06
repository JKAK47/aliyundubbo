package org.provider.service;

import org.service.api.Say;

public class SayServiceImpl implements Say{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "say : PLCC";
	}

	@Override
	public void sayHello(String msg) {
		// TODO Auto-generated method stub
		System.out.println("say :" +msg);
	}
	
	public static void main(String[] args) {
		SayServiceImpl impl=new SayServiceImpl();
		impl.sayHello("fsdfdsf");
	}
}
