package com.mt.msm.userinputs;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mt.msm.bo.Mobile;
import com.mt.msm.mobiledao.MySqlImplementation;
import com.mt.msm.mobileregistration.AddMobile;
import com.mt.msm.mobileregistration.DeleteMobile;
import com.mt.msm.mobileregistration.DisplayMobiles;
import com.mt.msm.mobileregistration.UpdateMobile;

import java.util.Scanner;

public class MainClass {

public static void main(String[] args) throws SQLException {
	
		Scanner sc=new Scanner(System.in);
		int loopVar=1;
		new MySqlImplementation().initializeDb();
		do
		{
			displayMenu();
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter how many mobiles do you want to add :");
				int number=sc.nextInt();
				try
				{
					
					AddMobile.addMobile(number);
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				System.out.println("mobiles added to the db");
					break;
			case 2: 
				try
				{
					DisplayMobiles.displayMobiles();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				break;
			case 3:
				try
				{
					UpdateMobile.updateMobile();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				break;
			case 4: 
				try
				{
					DeleteMobile.deleteMobile();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
					break;
			case 5:loopVar++;
					break;
			default:System.out.println("invalid option");
				
			}
			
		}while(loopVar==1);
		new MySqlImplementation().closeConnection();
	}
	static void displayMenu()
	{
		System.out.println("*****************Menu*********************\n");
		System.out.println("1.add mobiles");
		System.out.println("2.display all mobiles");
		System.out.println("3.update mobiles");
		System.out.println("4.delete mobiles");
		System.out.println("5.exit");
		System.out.println("******************************************");
	}

}


