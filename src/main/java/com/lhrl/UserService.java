package com.lhrl;

public interface UserService {

	public  default void say() {
		System.out.println("�ӿ�Ĭ�Ϸ���");
	}
	
	public abstract void sayHello();
}
