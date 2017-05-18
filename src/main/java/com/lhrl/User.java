package com.lhrl;

public class User implements UserService{

	public static void main(String[] args) {
		User user=new User();
		user.say();
		user.sayHello();
	}

	@Override
	public void sayHello() {
		System.out.println("我是子类的实现");
	}
	
}
