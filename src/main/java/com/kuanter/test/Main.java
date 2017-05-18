package com.kuanter.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
	 	Calendar c = Calendar.getInstance();    
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//����Ϊ1��,��ǰ���ڼ�Ϊ���µ�һ�� 
        String first = format.format(c.getTime());
        System.out.println("===============first:"+first);
        
        //��ȡ��ǰ�����һ��
        Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
        String last = format.format(ca.getTime());
        System.out.println("===============last:"+last);
	}
}
