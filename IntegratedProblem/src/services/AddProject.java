package services;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Project;

public class AddProject {

	public static void addProjects(ArrayList<Project> pList)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("enter project id");
		int id=sc.nextInt();
		System.out.println("enter project name");
		String name=sc.next();
		System.out.println("enter project duration");
		byte duration=sc.nextByte();
		pList.add(new Project(id,name,duration));
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
	}
}
