package services;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import java.util.Iterator;

import model.Customr;

public class SortCustomers {

	public static void sortCustomersByAddress(LinkedList<Customr> list)
	{
		LinkedList<Customr> temp=list;
		Collections.sort(temp,new AddressComparator());
		DisplayCustomers.displayCustomers(temp);
	}
	public static void sortCustomersByAcNo(LinkedList<Customr> list)
	{
		LinkedList<Customr> temp=list;
		Collections.sort(temp,new AcNoComparator());
		DisplayCustomers.displayCustomers(temp);
	}
}
class AddressComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Customr c1=(Customr)o1;
		Customr c2=(Customr)o2;
		return c1.getAddress().compareTo(c2.getAddress());
	}
	
}
class AcNoComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Customr c1=(Customr)o1;
		Customr c2=(Customr)o2;
		if(c1.getAcNo()==c2.getAcNo())
			return 0;
		else if(c1.getAcNo()>c2.getAcNo())
			return 1;
		else
			return -1;
	}
}
