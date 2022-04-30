package com.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintList {

	@Autowired
	private List<String> names;
	@Autowired
	private List<Student> students;

	public void printStudents() {
		System.out.println("----------Name List----------");
		for (String n : names) {
			System.out.println(n);
		}

		System.out.println("----------Student List----------");
		for (Student st : students) {
			System.out.println(st);
		}

	}

}
