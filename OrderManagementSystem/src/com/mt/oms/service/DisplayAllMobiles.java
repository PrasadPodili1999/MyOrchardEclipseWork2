package com.mt.oms.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mt.oms.bo.Mobile;
import com.mt.oms.dao.OrdersDaoImpl;


public class DisplayAllMobiles {

	public static void displayAllMobiles() throws SQLException
	{
		ArrayList<Mobile> mobiles=new OrdersDaoImpl().displayAllMobiles();
		for(Mobile m:mobiles)
		{
			System.out.println(m+"\n");
		}
	}
}
