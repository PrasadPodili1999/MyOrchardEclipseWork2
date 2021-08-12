package com.mt.hibernate4.app;

import java.util.Iterator;
import java.util.List;

import com.mt.hibernate4.dao.EmployeeDao;
import com.mt.hibernate4.model.Employee;
import com.mt.hibernate4.model.Office;

public class OfficeApp {

	public static void main(String[] args) {
		EmployeeDao ed=new EmployeeDao();
		
		Employee emp1=new Employee("prasad", "prasad@gmail.com");
		Employee emp2=new Employee("madhu", "madhu@gmail.com");
		
		Office off1=new Office("tcs", "hyderabad");
		Office off2=new Office("kpmg", "bangalore");
		
		emp1.setOffice(off1);
		emp2.setOffice(off1);
		
		
		ed.saveEmployee(emp1);
		ed.saveEmployee(emp2);
		
		 List<Employee> li=(List<Employee>)ed.getAllEmployees();
		 Iterator<Employee> itr=li.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 ed.updateEmployee();
		 //ed.updateEmployee();
		
		 List<Employee> li1=(List<Employee>)ed.getAllEmployees();
		 Iterator<Employee> itr1=li1.iterator();
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next());
		 }
		 ed.deleteEmployee(1);
	       //li.forEach(emp1->System.out.println(emp1.getId()+" : "+emp1.getName()+" : "+emp1.getEmail()+" : "+emp1.getOffice()));
	}

}
