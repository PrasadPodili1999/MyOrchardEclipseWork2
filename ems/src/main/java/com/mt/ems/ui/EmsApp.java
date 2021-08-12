package com.mt.ems.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.mt.ems.dao.EmployeeDaoImpl;
import com.mt.ems.service.AddEmployee;
import com.mt.ems.service.DeleteEmployee;
import com.mt.ems.service.DisplayEmployee;
import com.mt.ems.service.UpdateEmployee;


public class EmsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new EmployeeDaoImpl().initializeDb();
		int loopVar = 1;
		do {
			displayMenu();
			System.out.println("enter choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				try
				{
					AddEmployee.addEmployee();
				} 
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("enter number of employees u want to add ");
				int num=sc.nextInt();
				try
				{
					AddEmployee.addEmployee(num);
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("enter id ");
				int id=sc.nextInt();
				try
				{
					DisplayEmployee.displayEmployeeById(id);
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 4:
				try
				{
					DisplayEmployee.displayAllEmployee();
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 5:
				System.out.println("enter id : ");
				int eid=sc.nextInt();
				System.out.println("enter new salary : ");
				double sal=sc.nextDouble();
				try
				{
					UpdateEmployee.updateEmployeeSalary(eid, sal);
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 6:
				System.out.println("enter id : ");
				int empId=sc.nextInt();
				try
				{
					DeleteEmployee.deleteEmployeeById(empId);
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 7:
				new EmployeeDaoImpl().closeConnection();
				loopVar++;
				break;
			default:
				System.err.println("invalid choice!!!");
			}
		} while (loopVar == 1);

	}

	public static void displayMenu() {
		System.out.println("\n1.insert employee\n");
		System.out.println("2.insert multiple employees\n");
		System.out.println("3.display employee by id\n");
		System.out.println("4.display employees\n");
		System.out.println("5.update employee\n");
		System.out.println("6.delete employee by id\n");
		System.out.println("7.exit");
	}
}
