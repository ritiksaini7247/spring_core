package com.client;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.dao.EmployeeDao;

public class MyClient {
	public static void main(String[] args) throws SQLException {
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("MyConfig.xml");

		EmployeeDao daoObj = cntxt.getBean("empDao", EmployeeDao.class);

//		//-------Add Record----
//		Employee employee = new Employee();
//		employee.setEmpId(5);
//		employee.setEmpName("Hunny2");
//		employee.setEmpSal(60000f);
//
//		int addRecord = daoObj.addRecord(employee);
//
//		if (addRecord > 0)
//			System.out.println("REcord Inserted...");

//		// -------Update Record----
//		Employee employee = new Employee();
//		employee.setEmpId(5);
//		employee.setEmpName("Ritik");
//		employee.setEmpSal(60000f);
//
//		int addRecord = daoObj.updateRecord(employee);
//
//		if (addRecord > 0)
//			System.out.println("Record Updated...");

//		// -------Delete Record----
//		int addRecord = daoObj.deleteRecord(4);
//
//		if (addRecord > 0)
//			System.out.println("Record Deleted...");

//		// -------Find Record----
//		Employee emp = daoObj.findEmployeeById(5);
//
//		if (emp.getEmpName() == null)
//			System.err.println("Record Not Found..");
//		else
//			System.out.println(emp);

		// -------Find Record----
		List<Employee> allEmployees = daoObj.findAllEmployees();

		if (allEmployees.size() <= 0)
			System.err.println("Employees Not Found..");
		else {
			Iterator<Employee> iterator = allEmployees.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
}
