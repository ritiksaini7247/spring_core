package com.beans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mapBean")
public class PrintMap {

	@Autowired
	private Map<Integer, String> names;
	@Autowired
	private Map<Integer, Student> students;

	public void printStudents() {
		System.out.println("----------Name Set----------");
		Iterator<Entry<Integer, String>> itr = names.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------Student Set----------");
		Iterator<Entry<Integer, Student>> itr2 = students.entrySet().iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
