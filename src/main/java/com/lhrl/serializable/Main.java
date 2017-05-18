package com.lhrl.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���Զ������л��ͷ����л�
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
	 * �������л�
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void SerializePerson() throws FileNotFoundException, IOException{
		Person person=new Person();
		person.setName("admin");
		person.setAge(20);
		person.setSex("��");
		//objectOutputStream���������� ��person�������л���f�� ��ɶԶ�������л�����
		ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("D:/person.txt"));
		oo.writeObject(person);
		System.out.println("person�������л��ɹ� ��");
		oo.close();
			
	}
	
	/**
	 * ����ķ����л�
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static Person DeserializePerson() throws FileNotFoundException, IOException, ClassNotFoundException{
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/person.txt"));
		Person person=(Person)ois.readObject();
		System.out.println("person�������л��ɹ� ��");
		return person;
	}
}
