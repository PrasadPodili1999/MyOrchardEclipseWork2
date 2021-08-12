package com.mt.msm.mobileregistration;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mt.msm.bo.Mobile;
import com.mt.msm.mobiledao.MySqlImplementation;

public class DisplayMobiles {

	public static void displayMobiles() throws SQLException
	{
		ArrayList<Mobile> al=new MySqlImplementation().displayMobiles();
		if(al.size()>0)
		{
			for(Mobile m:al)
			{
				System.out.println(m.getId()+" "+m.getModel()+" "+m.getPrice()+" "+m.getDateOfManufacture());
			}
		}
		else
			System.err.println("No Data Available!!!");
		
	}
}
