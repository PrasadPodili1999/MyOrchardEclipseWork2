package model;

import java.util.ArrayList;;
public class Manager {

	private int id;
	private String name;
	private String department;
	private ArrayList<Project> pList;
	public Manager()
	{
		super();
	}
	public Manager(int id, String name, String department, ArrayList<Project> pList) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.pList = pList;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ArrayList<Project> getpList() {
		return pList;
	}
	public void setpList(ArrayList<Project> pList) {
		this.pList = pList;
	}
	
	
	
	
}
