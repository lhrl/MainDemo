package com.lhrl;

public interface UserService {

	public  default void say() {
		System.out.println("接口默认方法");
	}
	
	public abstract void sayHello();
}
