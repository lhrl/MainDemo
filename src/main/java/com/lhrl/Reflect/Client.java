package com.lhrl.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Client {
	/**
	 * �����ȡ����
	 * @param args
	 */
	public static void main(String[] args) {
		Student student=new Student();
		Class<?> stu=student.getClass();
		try {
			Field field=stu.getDeclaredField("name");
			field.setAccessible(true);
			String name=(String)field.get(student);
			System.out.println(name);
			System.out.println("-----------��ȡ����ֵ------------------");
			Method method=stu.getMethod("getName", new Class[0]);
			String name1=(String)method.invoke(student, new Object[0]);
			System.out.println(name1);
			System.out.println("-----------��ȡ�޲η���ֵ------------------");
			Method method1=stu.getMethod("hello", String.class);
			String str=(String)method1.invoke(student, "���");
			System.out.println(str);
			System.out.println("-----------��ȡ�вη���ֵ------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
