package com.mt.ems.service;

import java.sql.SQLException;

import com.mt.ems.dao.EmployeeDaoImpl;

public class DeleteEmployee {

	public static void deleteEmployeeById(int id) throws SQLException
	{
		int result=new EmployeeDaoImpl().deleteEmployeeById(id);
		if(result!=0)
		{
			System.out.println("employee deleted successfully");
		}
	}
}
