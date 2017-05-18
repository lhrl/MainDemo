package com.lhrl.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试对象序列化和反序列化
 * @author liulang
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		/*SerializePerson();*/
		Person person=DeserializePerson();
		System.out.println(person.getName()+","+person.getAge()+","+person.getSex()+","+person.say()+","+person.hello());
	}
	
	/**
	 * 对象序列化
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void SerializePerson() throws FileNotFoundException, IOException{
		Person person=new Person();
		person.setName("admin");
		person.setAge(20);
		person.setSex("男");
		//objectOutputStream对象输入流 将person对象序列化到f盘 完成对对象的序列化操作
		ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("D:/person.txt"));
		oo.writeObject(person);
		System.out.println("person对象序列化成功 ！");
		oo.close();
			
	}
	
	/**
	 * 对象的反序列化
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static Person DeserializePerson() throws FileNotFoundException, IOException, ClassNotFoundException{
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/person.txt"));
		Person person=(Person)ois.readObject();
		System.out.println("person对象反序列化成功 ！");
		return person;
	}
}
