package com.beans;

import java.sql.SQLException;
import java.util.List;

public interface Operation {

	public int addRecord(Employee employee) throws SQLException;

	public int updateRecord(Employee employee) throws SQLException;

	public int deleteRecord(int empId) throws SQLException;

	public Employee findEmployeeById(int empId) throws SQLException;

	public List<Employee> findAllEmployees() throws SQLException;

}
