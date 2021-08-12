package services;

import java.util.LinkedList;
import java.util.Scanner;

import model.Customr;

public class AddCustomer {

	public static void addCustomers(LinkedList<Customr> list)
	{
		Scanner sc=new Scanner(System.in);
		Customr c=new Customr(); 
		System.out.println("enter acc num: ");
		long acNo=sc.nextLong();
	    c.setAcNo(acNo);
		System.out.println("enter name : ");
		String name=sc.next();
		c.setName(name);
		System.out.println("enter acc type :");
		String type=sc.next();
		c.setAcType(type);
		System.out.println("enter balance :");
		double bal=sc.nextDouble();
		c.setBalance(bal);
		System.out.println("enter address : ");
		String address=sc.next();
		c.setAddress(address);
		list.add(c);
		
	}
}
