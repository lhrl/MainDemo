package com.lhrl.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONObject;

/**
 * java�������ض�������
 * @author liu lang
 *
 * 2017��2��9������8:26:28
 */
public class ReturnMultipleResult {
	private static final Student stu=new Student("С��", "�廪��ѧ");
	private static final Teacher teacher=new Teacher("����ʦ", "Ӣ��");
	//ʹ��Json
	public static JSONObject way1(){
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("s", stu);
		jsonObject.put("t", teacher);
		return jsonObject;
	}
	//ʹ�ü���
	public static Map<String, Object>way2(){
		Map<String, Object>map= new HashMap<String, Object>();
		map.put("s", stu);
		map.put("t", teacher);
		return map;
	}
	//ʹ��Ԫ��
	public static TwoTuple<Student, Teacher>way3(){
		return new TwoTuple<Student, Teacher>(stu, teacher);
	}
	public static void main(String[] args) {
		JSONObject result=ReturnMultipleResult.way1();
		System.out.println(result);
		
		Map<String, Object>map=new HashMap<String, Object>();
		System.out.println(map);
		map.put("s1", new Student("С��", "������ѧ"));
		map.put("t1", new Teacher("����ʦ", "��ѧ"));
		System.out.println(map);
		Student stu=(Student)result.get("s");
		System.out.println(stu);
		System.out.println(stu.getName()+","+stu.getSchool());
		
		System.out.println("============================");
		
		Map<String, Object>map2=ReturnMultipleResult.way2();
		System.out.println(map2);
		
		for(Entry<String, Object> entry:map2.entrySet()){
			if(entry.getKey().equals("s")){
				Student stu1=(Student)entry.getValue();
				System.out.println(stu1.getName());
			}else if(entry.getKey().equals("t")){
				Teacher teacher1=(Teacher)entry.getValue();
				System.out.println(teacher1.getName());
			}
		}
		
		System.out.println("================================");
		
		TwoTuple<Student, Teacher>result3=ReturnMultipleResult.way3();
		System.out.println(result3.first.getName());
		System.out.println(result3.second.getName());
		
		System.out.println("��ǰ�̵߳����֣�"+Thread.currentThread().getName());
	}
	
}
