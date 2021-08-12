package services;
import java.util.Scanner;
import java.util.ArrayList;

import model.Project;

public class DeleteProject {

	static Scanner sc=new Scanner(System.in);
	public static void deleteParticularProjectById(ArrayList<Project> pList)
	{
		System.out.println("enter project id : ");
		int id=sc.nextInt();
		
		for(int i=0;i<pList.size();i++)
		{
			if(pList.get(i).getId()==id)
			{
				pList.remove(i);
			}
		}
		
		
	}
	
}
