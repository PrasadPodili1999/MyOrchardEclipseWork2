package model;

public class Project {

	private int id;
	private String name;
	private byte projectDuration;
	
	
	public Project()
	{
		super();
	}
	
	public Project(int id, String name, byte projectDuration) {
		super();
		this.id = id;
		this.name = name;
		this.projectDuration = projectDuration;
	}
	//getters and setters of id 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//getters and setters of name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getters and setters of project duration
	public byte getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(byte projectDuration) {
		this.projectDuration = projectDuration;
	}
	
}
