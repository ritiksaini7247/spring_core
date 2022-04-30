package com.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.Student;

@Configuration
@ComponentScan("com")
public class MyConfig {

	@Bean
	public Map<Integer, String> getNames() {
		Map<Integer, String> names = new HashMap<>();
		names.put(1, "Ritik");
		names.put(2, "Sagar");
		names.put(3, "Varun");
		names.put(4, "Badhan");
		names.put(5, "Sazzaad");
		return names;
	}

	@Bean
	public Map<Integer, Student> getStudents() {
		Map<Integer, Student> students = new HashMap<>();

		Student student1 = new Student();
		student1.setStudentName("Ritik");
		student1.setStudentFee(10050f);
		Student student2 = new Student();
		student2.setStudentName("Sagar");
		student2.setStudentFee(050f);

		students.put(1, student1);
		students.put(2, student1);

		return students;
	}

}
