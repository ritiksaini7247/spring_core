package com.beans;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("setBean")
public class PrintSet {

	@Autowired
	private Set<String> names;
	@Autowired
	private Set<Student> students;

	public void printStudents() {
		System.out.println("----------Name Set----------");
		for (String n : names) {
			System.out.println(n);
		}

		System.out.println("----------Student Set----------");
		for (Student st : students) {
			System.out.println(st);
		}

	}

}
