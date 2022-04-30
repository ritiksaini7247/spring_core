package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.PrintMap;
import com.config.MyConfig;

public class MyClient {
	public static void main(String[] args) {
		ApplicationContext cntxt = new AnnotationConfigApplicationContext(MyConfig.class);

		PrintMap bean = cntxt.getBean("mapBean", PrintMap.class);
		bean.printStudents();
	}
}
