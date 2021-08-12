package services;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


import model.Customr;

public class UpdateCustomer {

	public static void updateCustomer(LinkedList<Customr>list)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name : ");
		String name=sc.next(); 
		System.out.println("enter balance to be updated : ");
		double bal=sc.nextDouble();
		for(Customr c:list)
		{
			if(c.getName().equals(name))
			{
				c.setBalance(bal);
			}
		}
				
	}
	
}
