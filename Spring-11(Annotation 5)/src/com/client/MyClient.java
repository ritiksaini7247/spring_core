package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.PrintList;
import com.config.MyConfig;

public class MyClient {
	public static void main(String[] args) {
		ApplicationContext cntxt = new AnnotationConfigApplicationContext(MyConfig.class);

		PrintList bean = cntxt.getBean("printList", PrintList.class);
		bean.printStudents();
	}
}
