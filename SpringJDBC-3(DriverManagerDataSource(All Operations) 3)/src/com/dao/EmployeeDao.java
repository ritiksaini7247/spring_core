package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.beans.Employee;
import com.beans.Operation;

public class EmployeeDao implements Operation {

	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public int addRecord(Employee employee) throws SQLException {
		connection = dataSource.getConnection();
		String sql = "insert into employees values(?,?,?)";
		pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, employee.getEmpId());
		pstmt.setString(2, employee.getEmpName());
		pstmt.setFloat(3, employee.getEmpSal());
		return pstmt.executeUpdate();
	}

	@Override
	public int updateRecord(Employee employee) throws SQLException {
		connection = dataSource.getConnection();
		String sql = "update employees set empname = '" + employee.getEmpName() + "' , empSal = '"
				+ employee.getEmpSal() + "' where empid = " + employee.getEmpId();
		pstmt = connection.prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int deleteRecord(int empId) throws SQLException {
		connection = dataSource.getConnection();
		String sql = "delete from employees where empid = " + empId;
		pstmt = connection.prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public Employee findEmployeeById(int empId) throws SQLException {
		connection = dataSource.getConnection();
		String sql = "select * from employees where empid = " + empId;
		pstmt = connection.prepareStatement(sql);
		rs = pstmt.executeQuery();

		Employee employee = new Employee();

		while (rs.next()) {
			employee.setEmpId(rs.getInt("empid"));
			employee.setEmpName(rs.getString("empname"));
			employee.setEmpSal(rs.getFloat("empsal"));
		}

		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() throws SQLException {
		connection = dataSource.getConnection();
		String sql = "select * from employees";
		pstmt = connection.prepareStatement(sql);
		rs = pstmt.executeQuery();

		List<Employee> employees = new ArrayList<>();

		while (rs.next()) {
			Employee employee = new Employee();
			employee.setEmpId(rs.getInt("empid"));
			employee.setEmpName(rs.getString("empname"));
			employee.setEmpSal(rs.getFloat("empsal"));
			employees.add(employee);
		}

		return employees;
	}

}
