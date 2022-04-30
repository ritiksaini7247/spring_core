package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.PrintSet;
import com.config.MyConfig;

public class MyClient {
	public static void main(String[] args) {
		ApplicationContext cntxt = new AnnotationConfigApplicationContext(MyConfig.class);

		PrintSet bean = cntxt.getBean("setBean", PrintSet.class);
		bean.printStudents();
	}
}
