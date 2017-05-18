package com.kuanter.test;

public class StudentServiceImpl extends AbstractStudent{

	@Override
	public void sayHello() {
		System.out.println("接口的方法");
	}

	@Override
	void say() {
		System.out.println("抽象类的方法");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

}
