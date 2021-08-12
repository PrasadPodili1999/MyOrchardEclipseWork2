package com.mt.oms.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.mt.oms.dao.OrdersDaoImpl;
import com.mt.oms.service.AddOrder;
import com.mt.oms.service.DisplayAllMobiles;
import com.mt.oms.service.DisplaySpecificMobile;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		new OrdersDaoImpl().initializeDb();
		int loopVar = 1;
		do {
			displayMenu();
			System.out.println("enter choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				try
				{
					AddOrder.addOrder();
				} 
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("enter required brand");
				String brand=sc.next();
				try
				{
					DisplaySpecificMobile.displayMobileByBrand(brand);
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 3:
				try
				{
					DisplayAllMobiles.displayAllMobiles();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				break;
			case 4:
				new OrdersDaoImpl().closeConnection();
				loopVar++;
				break;
			default:
				System.err.println("invalid choice!!!");
			}
		} while (loopVar == 1);
	}

	public static void displayMenu() {
		System.out.println("\n1.place order\n");
		System.out.println("2.display specific mobile by brand\n");
		System.out.println("3.display all mobiles\n");
		System.out.println("4.exit");
	}
}
