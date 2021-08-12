package com.mt.msm.mobileregistration;

import java.sql.SQLException;
import java.util.Scanner;

import com.mt.msm.mobiledao.MySqlImplementation;
public class DeleteMobile {

	public static void deleteMobile() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter model : ");
		String model=sc.next();
		int count=new MySqlImplementation().deleteMobile(model);
		System.out.println(count+" rows affected");
	}
}
