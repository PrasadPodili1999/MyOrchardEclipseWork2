package com.mt.oms.service;

import java.sql.SQLException;

import com.mt.oms.bo.Mobile;
import com.mt.oms.dao.OrdersDaoImpl;

public class DisplaySpecificMobile {

	public static void displayMobileByBrand(String brand) throws Exception
	{
		Mobile mobile=new OrdersDaoImpl().displayMobileByBrand(brand);
		
		if(mobile!=null)
		{
			System.out.println("mobile details : \n");
			System.out.println(mobile);
		}
		else
		{
			throw new MobileNotFoundException("required mobile not available in the databae");
		}
	}
}
class MobileNotFoundException extends Exception
{
	public MobileNotFoundException(String s)
	{
		super(s);
	}
}
