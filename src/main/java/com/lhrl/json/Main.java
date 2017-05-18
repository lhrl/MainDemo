package com.lhrl.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		ObjectMapper om=new ObjectMapper();
		Teacher teacher=new Teacher();
		teacher.setAge(30);
		teacher.setName("admin");
		Student stu=new Student();
		stu.setName("张三");
		stu.setAge(20);
		List<Student>stuList=new ArrayList<Student>();
		stuList.add(stu);
		
		Teacher teacher1=new Teacher();
		teacher1.setAge(30);
		teacher1.setName("admin");
		Student stu1=new Student();
		stu1.setName("李四");
		stu1.setAge(30);
		List<Student>stuList1=new ArrayList<Student>();
		stuList1.add(stu1);
		stuList1.add(stu1);
		
		List<List<Student>>stuArray=new ArrayList<List<Student>>();
		List<Student>s1=new ArrayList<Student>();
		s1.add(stu);
		s1.add(stu1);
		stuArray.add(s1);
		
		
		List<List<Student>>stuArray1=new ArrayList<List<Student>>();
		List<Student>s2=new ArrayList<Student>();
		s2.add(stu);
		s2.add(stu1);
		stuArray.add(s2);
		
		
		
		
		/*teacher.setListStudent(stuList);*/
		/*teacher1.setListStudent(stuList1);*/
		List<Teacher>teacherList=new ArrayList<Teacher>();
		teacherList.add(teacher);
		teacherList.add(teacher1);
		DisplayData displayData=new DisplayData();
		DisplayData displayData1=new DisplayData();
		displayData.setListStudent(stuArray);
		/*displayData1.setListStudent(stuArray1);*/
		teacher.setDisplayData(displayData);
		String jsonStr=om.writeValueAsString(teacher);
		System.out.println("json:"+jsonStr);
		/*List<Teacher> teaLists = Arrays.asList(
			    om.readValue(jsonStr, Teacher[].class)
			);
		System.out.println(teaLists);*/
		
		Teacher tea=om.readValue(jsonStr, Teacher.class);
		System.out.println(tea);
	}
}
