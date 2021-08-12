package com.mt.ems.bo;

public class EmployeeBo implements Comparable<EmployeeBo>{

	private int id;
	private String name;
	private byte age;
	private double salary;
	public EmployeeBo() {
		super();
	}
	public EmployeeBo(int id, String name, byte age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBo [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public int compareTo(EmployeeBo o) {
		int compare=name.compareTo(o.name);
		if(compare==0)
		{
			compare=Integer.compare(age, o.age);
		}
		return compare;
	}

}
