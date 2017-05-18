package com.lhrl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Main {

	public static void main1(String[] args) {

		int a = 10;
		String str = "hell0";
		Student stu = new Student();
		stu.setAge(10);
		Main.test(a, str, stu);
		System.out.println("???????????????" + a + "," + str + "," + stu.getAge());
		List<Student> stuList = new ArrayList<Student>();
		Student s = null;
		for (int i = 0; i < 10; i++) {
			s = new Student();
			s.setAge(i);
			stuList.add(s);
		}
		System.out.println(stuList.get(0).getAge());
		System.out.println("----------");
		for (Student student : stuList) {
			System.out.println(student.getAge());
		}

		Long s1 = 100L;
		Long s2 = 100L;
		System.out.println(s1.equals(s2));

		int[] lk = { 1, 2, 3 };
		for (int i = 0; i < lk.length; i++) {
			System.out.println(lk[i]);
		}

		Long.valueOf("12");
	}

	public static void test(int a, String str, Student stu) {
		a = 100;
		str = "????????????????";
		stu.setAge(100);

	}

	public static void main3(String[] args) {
		List<Object> strList = new ArrayList<Object>();
		strList.add(null);
		System.out.println(strList.size());
		Student student = new Student();
	}

	public static void main(String[] args) {
		
	}
}
