package services;

import model.Project;
import model.Manager;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class AddMaager {
 
	public static void addManager(ArrayList<Manager> al)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter manager id");
			int id=sc.nextInt();
			System.out.println("enter manager name");
			String name=sc.next();
			System.out.println("enter department ");
			String dept=sc.next();
			System.out.println("enter how many projects you want to add ");
			int number=sc.nextInt();
			ArrayList<Project> pList=new ArrayList<Project>();
			for(int i=0;i<number;i++)
			{
				AddProject.addProjects(pList);
			}
			al.add(new Manager(id,name,dept,pList));
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
