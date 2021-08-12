package com.mt.msm.mobileregistration;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mt.msm.mobiledao.MySqlImplementation;
import com.mt.msm.vo.MobileVo;
import java.util.Scanner;
public class AddMobile {

	public static void addMobile(int number) throws SQLException 
	{
		ArrayList<MobileVo> al=new ArrayList<MobileVo>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<number;i++)
		{
			System.out.println("enter model name : ");
			String model=sc.next();
			System.out.println("enter price :");
			double price=sc.nextDouble();
			System.out.println("enter date of manufcture :");
			String date=sc.next();
			al.add(new MobileVo(model,price,date));
		}
		new MySqlImplementation().addMobiles(al,number);
	}
}
