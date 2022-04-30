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
//		employee.setEmpId(9);
//		employee.setEmpName("Hubby");
//		employee.setEmpSal(607800f);
//
//		int addRecord = daoObj.addRecord(employee);
//
//		if (addRecord > 0)
//			System.out.println("REcord Inserted...");

//		// -------Update Record----
//		Employee employee = new Employee();
//		employee.setEmpId(5);
//		employee.setEmpName("Ritik");
//		employee.setEmpSal(1000000f);
//
//		int addRecord = daoObj.updateRecord(employee);
//
//		if (addRecord > 0)
//			System.out.println("Record Updated...");

		// -------Delete Record----
		int addRecord = daoObj.deleteRecord(9);

		if (addRecord > 0)
			System.out.println("Record Deleted...");

	}
}
