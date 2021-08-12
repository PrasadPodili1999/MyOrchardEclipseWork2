package client;
import java.util.ArrayList;
import java.util.Scanner;
import services.AddMaager;
import services.AddProject;
import services.DeleteProject;
import services.DisplayManagers;
import services.SortManagers;
import model.Manager;

public class ProjectManagementApp {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Manager> al=new ArrayList<Manager>();
		int loopVar=1;
		do
		{
			displayMenu();
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: AddMaager.addManager(al);
					break;
			case 2: 
				System.out.println("enter manager id : ");
				int mid1=sc.nextInt();
				for(int i=0;i<al.size();i++)
				{
					if(al.get(i).getId()==mid1)
					{
						AddProject.addProjects(al.get(i).getpList());
					}
				}
				break;
			case 3:
				System.out.println("enter manager id : ");
				int mid2=sc.nextInt();
				for(int i=0;i<al.size();i++)
				{
					if(al.get(i).getId()==mid2)
					{
						DeleteProject.deleteParticularProjectById(al.get(i).getpList());
					}
				}
				break;
			case 4: DisplayManagers.displayManagersHavingMoreProjects(al);
					break;
			case 5:SortManagers.sortManagersByName(al);
					break;
			case 6:SortManagers.sortManagersById(al);
					break;
			case 7:DisplayManagers.displayManagers(al);
					break;
			case 8: SortManagers.bubbleSortByName(al);
					break;
			case 9: SortManagers.insertionSortById(al);
					break;
			case 10:SortManagers.insertionSortByName(al);
					break;
			case 11:loopVar++;
					break;
			default:System.out.println("invalid option");
				
			}
			
		}while(loopVar==1);
	}
	static void displayMenu()
	{
		System.out.println("*****************Menu*********************\n");
		System.out.println("1.add new manager");
		System.out.println("2.add new project to the particular manager based on manager id");
		System.out.println("3.delete prticular project by project id");
		System.out.println("4.print manager details having more than 3 projects");
		System.out.println("5.sort managers by name");
		System.out.println("6.sort managers by id");
		System.out.println("7.display all managers");
		System.out.println("8.bubble sort managers by name");
		System.out.println("9.insertion sort managers by id");
		System.out.println("10.insertion sort managers by name");
		System.out.println("11.exit");
		System.out.println("******************************************");
	}

}
