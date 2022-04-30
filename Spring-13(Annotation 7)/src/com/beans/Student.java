package com.beans;

public class Student {

	private String studentName;
	private Float studentFee;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, Float studentFee) {
		super();
		this.studentName = studentName;
		this.studentFee = studentFee;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Float getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(Float studentFee) {
		this.studentFee = studentFee;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentFee=" + studentFee + "]";
	}

}
