package model;

public class Customr {

	private long acNo;
	private String name;
	private String acType;
	private double balance;
	private String address;
	
	public Customr()
	{
		super();
	}
	
	public Customr(long acNo, String name, String acType, double balance, String address) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.acType = acType;
		this.balance = balance;
		this.address = address;
	}
	public long getAcNo() {
		return acNo;
	}
	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}