package com.mt.ems.service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import com.mt.ems.bo.EmployeeBo;
import com.mt.ems.dao.EmployeeDaoImpl;

public class DisplayEmployee {

	public static void displayEmployeeById(int id) throws Exception
	{
		EmployeeBo emp=new EmployeeDaoImpl().displayEmployeeById(id);
		
		if(emp!=null)
		{
			System.out.println("employee details\n");
			System.out.println(emp);
		}
		else
		{
			throw new EmployeeNotFoundException("employee with id : "+id+" not available");
		}
	}
	public static void displayAllEmployee() throws SQLException
	{
		List<EmployeeBo> empList=new EmployeeDaoImpl().displayAllEmployee();
		Collections.sort(empList);
		empList.stream().map(mapper->mapper).forEach(n->System.out.println(n));
		
	}
}
class EmployeeNotFoundException extends Exception
{
	public EmployeeNotFoundException(String s)
	{
		super(s);
	}
}
