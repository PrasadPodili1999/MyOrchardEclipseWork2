package model;

public class Book {
	private int id;
	private String name;
	private int publishers;
	private String author;
	private int noOfCopies;
	public Book()
	{
		super();
	}
	public Book(int id, String name, int publishers, String author, int noOfCopies) {
		this.id = id;
		this.name = name;
		this.publishers = publishers;
		this.author = author;
		this.noOfCopies = noOfCopies;
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
	public int getPublishers() {
		return publishers;
	}
	public void setPublishers(int publishers) {
		this.publishers = publishers;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	} 
	
}
