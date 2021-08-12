package com.mt.ems.vo;

public class EmployeeVo {

	private String name;
	private byte age;
	private double salary;
	public EmployeeVo() {
		super();
	}
	public EmployeeVo(String name, byte age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
		return "EmployeeVo [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
