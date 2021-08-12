package com.mt.ems.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.mt.ems.dao.EmployeeDaoImpl;

public class UpdateEmployee {

	public static void updateEmployeeSalary(int id,double sal) throws SQLException
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter id : ");
//		int id=sc.nextInt();
//		System.out.println("enter new salary : ");
//		double sal=sc.nextDouble();
		int result=new EmployeeDaoImpl().updateEmployeeSalary(id, sal);
		if(result!=0)
		{
			System.out.println("employee updated successfully");
		}
		
	}
}
