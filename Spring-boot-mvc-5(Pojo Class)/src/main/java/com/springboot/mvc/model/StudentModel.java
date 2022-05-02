package com.springboot.mvc.model;

public class StudentModel {

	private Integer studentId;
	private String studentName;
	private Float studentFee;
	private StudentAddress studentAddress;

	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(Integer studentId, String studentName, Float studentFee, StudentAddress studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.studentAddress = studentAddress;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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

	public StudentAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "StudentModel [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", studentAddress=" + studentAddress + "]";
	}

}
