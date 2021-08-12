package com.mt.msm.mobileregistration;
import java.sql.SQLException;
import java.util.Scanner;

import com.mt.msm.mobiledao.MySqlImplementation;
public class UpdateMobile {

	public static void updateMobile() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter model : ");
		String model=sc.next();
		System.out.println("enter new price :");
		double price=sc.nextDouble();
		int count=new MySqlImplementation().updateMobilePrice(price, model);
		System.out.println(count+" rows updated!!");
	}
}
