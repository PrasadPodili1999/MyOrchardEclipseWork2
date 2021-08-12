package arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("poi");
		
		emp.setSal(120);
		List<Address> list2=new ArrayList<>();
		
		list2.add(new Address(1, "sad"));
		list2.add(new Address(2, "jar"));
		emp.setAddress(list2);
		
		System.out.println(emp.getAddress().toString());
	}

}
class Address
{
	private int id;
	private String name;
	@Override
	public String toString() {
		return name ;
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
	public Address() {
		super();
	}
	public Address(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
class Employee
{
	private int id;
	private String name;
	private int sal;
	private List<Address> address;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Employee(int id, String name, int sal, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}
	public Employee() {
		super();
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}