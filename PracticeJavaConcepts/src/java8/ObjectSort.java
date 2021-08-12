package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectSort {

	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(new Employee(1,"sam",1200,"work"),new Employee(2,"jam",200,"k"),
				new Employee(3,"ram",1200,"ork"),new Employee(4,"pam",120,"rk"));
		for(Employee e:empList)
		{
			System.out.println(e);
		}
		System.out.println("\n======================\n");
		empList.stream().sorted().collect(Collectors.toList()).forEach((n)->System.out.println(n));
		System.out.println("\n======================\n");
		empList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(n->System.out.println(n));
		
	}

}

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double sal;
	private String dept;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		int result=Double.compare(this.sal, o.getSal());
		if(result==0)
		{
			result= this.name.compareTo(o.getName());
		}
		return result;
	}
	
	
}
