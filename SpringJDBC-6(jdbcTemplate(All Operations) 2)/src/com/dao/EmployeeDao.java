package com.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Employee;
import com.beans.Operation;

public class EmployeeDao implements Operation {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addRecord(Employee employee) throws SQLException {
		String sql = "insert into employees values(?,?,?)";
		Object[] arr = { employee.getEmpId(), employee.getEmpName(), employee.getEmpSal() };
		return jdbcTemplate.update(sql, arr);
	}

	@Override
	public int updateRecord(Employee employee) throws SQLException {
		String sql = "update employees set empname = '" + employee.getEmpName() + "' , empSal = '"
				+ employee.getEmpSal() + "' where empid = " + employee.getEmpId();
		return jdbcTemplate.update(sql);
	}

	@Override
	public int deleteRecord(int empId) throws SQLException {
		String sql = "delete from employees where empid = " + empId;
		return jdbcTemplate.update(sql);
	}
}
