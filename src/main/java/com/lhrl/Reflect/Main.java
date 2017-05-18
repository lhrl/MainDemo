package com.lhrl.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		//三种获取到Class类对象
		Class<?>stu1=new Student().getClass();
		Class<?>stu2=Student.class;
		Class<?>stu3=null;
		Student stu4=null;
		Student stu5=null;
		Student stu6=null;
		try {
			stu3=Class.forName("com.lhrl.Reflect.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println("-----------------------------");
		
		try {
			stu4=(Student)stu1.newInstance();
			stu5=(Student)stu2.newInstance();
			stu6=(Student)stu3.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println(stu4);
		System.out.println(stu5);
		System.out.println(stu6);
		
		Field[] field=stu1.getDeclaredFields();
		for (Field field2 : field) {
			field2.setAccessible(true);//访问到私有属性
			System.out.println(field2.getName());
		}
		
		Method[] method=stu1.getMethods();
		for (Method method2 : method) {
			System.out.println(method2.getName());
		}
		
		Constructor[] constructors=stu1.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
	}
}
