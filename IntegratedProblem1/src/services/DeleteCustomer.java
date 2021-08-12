package services;

import java.util.LinkedList;
import java.util.Scanner;

import model.Customr;

public class DeleteCustomer {

	public static void deleteCustomer(LinkedList<Customr> list)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name : ");
		String name=sc.next();
		list.removeIf(filter->filter.getName().equals(name));
	}
}
