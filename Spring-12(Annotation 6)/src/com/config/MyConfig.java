package com.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.Student;

@Configuration
@ComponentScan("com")
public class MyConfig {

	@Bean
	public Set<String> getNames() {
		Set<String> names = new HashSet<>();
		names.add("Ritik");
		names.add("Sagar");
		names.add("Varun");
		names.add("Varun");
		names.add("Badhan");
		names.add("Sazzaad");
		names.add("Sazzaad");
		return names;
	}

	@Bean
	public Set<Student> getStudents() {
		Set<Student> students = new HashSet<>();

		Student student1 = new Student();
		student1.setStudentName("Ritik");
		student1.setStudentFee(10050f);
		Student student2 = new Student();
		student2.setStudentName("Sagar");
		student2.setStudentFee(050f);

		students.add(student1);
		students.add(student1);
		students.add(student2);
		students.add(student2);

		return students;
	}

}
