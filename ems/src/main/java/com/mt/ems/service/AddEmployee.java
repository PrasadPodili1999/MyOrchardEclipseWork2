package com.mt.ems.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mt.ems.dao.EmployeeDaoImpl;
import com.mt.ems.vo.EmployeeVo;

public class AddEmployee {

	static Scanner sc=new Scanner(System.in);
	public static void addEmployee() throws SQLException
	{
		
		System.out.println("enter employee name");
		String name=sc.next();
		System.out.println("enter employee age");
		byte age=sc.nextByte();
		System.out.println("enter employee salary :");
		double salary=sc.nextDouble();
		EmployeeVo emp=new EmployeeVo(name, age, salary);
		int result=new EmployeeDaoImpl().addEmployee(emp);
		if(result!=0)
		{
			System.out.println("employee added successfully");
		}
	}
	public static void addEmployee(int num) throws SQLException
	{
		List<EmployeeVo> empList=new ArrayList<EmployeeVo>();
		for(int i=0;i<num;i++)
		{
			System.out.println("enter employee name");
			String name=sc.next();
			System.out.println("enter employee age");
			byte age=sc.nextByte();
			System.out.println("enter employee salary :");
			double salary=sc.nextDouble();
			empList.add(new EmployeeVo(name, age, salary));
		}
		int result=new EmployeeDaoImpl().addEmployee(empList);
		if(result!=0)
		{
			System.out.println("employee added successfully");
		}
	}
}
