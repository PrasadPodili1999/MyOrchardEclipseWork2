package com.mt.hibernate2;

import java.util.List;

import com.mt.hibernate2.dao.EmployeeDao;
import com.mt.hibernate2.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDao empDao=new EmployeeDao();
    	
    	//save employee
        Employee emp=new Employee("prasad",30000, "JavaDeveloper");
        //empDao.saveEmployee(emp);
        
        //update employee
    	//Employee emp=new Employee();
        emp.setName("madhu");
        emp.setJob("AiArchitect");
        empDao.updateEmployee(emp);
        
        //get employee by id
        Employee em=empDao.getEmployeeById(1);
        System.out.println(em);
        
        //get all emploees
        List<Employee> li=(List<Employee>)empDao.getAllEmployees();
       li.forEach(emp1->System.out.println(emp1.getId()+" : "+emp1.getName()+" : "+emp1.getSal()+" : "+emp1.getJob()));
        
        
        
        //delete employee
        empDao.deleteEmployee(emp.getId());
    }
}
