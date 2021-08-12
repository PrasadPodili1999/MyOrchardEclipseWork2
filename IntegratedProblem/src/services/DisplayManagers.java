package services;

import model.Manager;
import model.Project;

import java.util.ArrayList;

public class DisplayManagers {
	
	public static void displayManagers(ArrayList<Manager> al)
	{
		for(Manager man:al)
		{
				System.out.println("============");
				System.out.println("manager id : "+man.getId());
				System.out.println("manager name : "+man.getName());
				System.out.println("manager department : "+man.getDepartment());
				System.out.println("project details are :");
				displayProjects(man.getpList());
		}
	}

	public static void displayManagersHavingMoreProjects(ArrayList<Manager> al)
	{
		for(Manager man:al)
		{
			if(man.getpList().size()>=2)
			{
				System.out.println("============");
				System.out.println("manager id     : "+man.getId());
				System.out.println("manager name   : "+man.getName());
				System.out.println("manager department : "+man.getDepartment());
				System.out.println("project details are...");
				displayProjects(man.getpList());
			}
		}
	}
	public static void displayProjects(ArrayList<Project> pList)
	{
		for(Project pro:pList)
		{
			System.out.println("	===>	project id :"+pro.getId());
			System.out.println("			project name :"+pro.getName());
			System.out.println("			project duration :"+pro.getProjectDuration());
		}
	}
}
