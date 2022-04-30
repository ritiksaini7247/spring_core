package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.Student;

@Configuration
@ComponentScan("com")
public class MyConfig {

	@Bean
	public List<String> getNames() {
		List<String> names = new ArrayList<>();
		names.add("Ritik");
		names.add("Sagar");
		names.add("Varun");
		names.add("Badhan");
		names.add("Sazzaad");
		return names;
	}

	@Bean
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();

		Student student1 = new Student();
		student1.setStudentName("Ritik");
		student1.setStudentFee(10050f);
		Student student2 = new Student();
		student2.setStudentName("Sagar");
		student2.setStudentFee(050f);

		students.add(student1);
		students.add(student2);

		return students;
	}

}
