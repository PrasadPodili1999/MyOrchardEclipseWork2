package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import services.DisplayManagers;
import model.Manager;

public class SortManagers {

	public static void sortManagersByName(ArrayList<Manager> al)
	{
		Collections.sort(al,new NameComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Manager man=(Manager)itr.next();
			System.out.println(man.getId()+" "+man.getName()+" "+man.getDepartment());
			DisplayManagers.displayProjects(man.getpList());
		}
		
	}
	public static void bubbleSortByName(ArrayList<Manager> list)
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=0;j<list.size()-i-1;j++)
			{
				if(list.get(j).getName().compareTo(list.get(j+1).getName())>0)
				{
					Collections.swap(list,j,j+1);
				}
			}
		}
	}
	public static void insertionSortById(ArrayList<Manager> list)
	{
		int j=0;
		for(int i=1;i<list.size();i++)
		{
			Manager temp=list.get(i);
			for(j=i-1;j>=0 &&temp.getId()<list.get(j).getId() ;j--)
			{
				list.set(j+1, list.get(j));
			}
			list.set(j+1, temp);
		}
	}
	public static void insertionSortByName(ArrayList<Manager> list)
	{
		int j=0;
		for(int i=1;i<list.size();i++)
		{
			Manager temp=list.get(i);
			for(j=i-1;j>=0 &&temp.getName().compareTo(list.get(j).getName())<0 ;j--)
			{
				list.set(j+1, list.get(j));
			}
			list.set(j+1, temp);
		}
	}
	
	public static void sortManagersById(ArrayList<Manager> al)
	{
		Collections.sort(al,new IdComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Manager man=(Manager)itr.next();
			System.out.println(man.getId()+" "+man.getName()+" "+man.getDepartment());
			DisplayManagers.displayProjects(man.getpList());
		}
	}
}
class NameComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Manager m1=(Manager)o1;
		Manager m2=(Manager)o2;
		return m1.getName().compareTo(m2.getName());
	}
}
class IdComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Manager m1=(Manager)o1;
		Manager m2=(Manager)o2;
		if(m1.getId()==m2.getId())
			return 0;
		else if(m1.getId()>m2.getId())
			return 1;
		else
			return -1;
	}
}
