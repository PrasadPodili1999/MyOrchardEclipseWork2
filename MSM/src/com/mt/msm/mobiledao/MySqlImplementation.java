package com.mt.msm.mobiledao;

import com.mt.msm.bo.Mobile;
import com.mt.msm.connection.ConnectionDb;
import com.mt.msm.mobileregistration.AddMobile;
import com.mt.msm.vo.MobileVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySqlImplementation implements MobileDao{

	
	public void initializeDb() 
	{
		//load and register driver to drivermanager and get db connection
		try
		{
			//Class.forName(ConnectionDb.driver);
			ConnectionDb.con=DriverManager.getConnection(ConnectionDb.url,ConnectionDb.username,ConnectionDb.pwd);
			System.out.println("db connected successfully");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public void addMobiles(ArrayList<MobileVo> al,int number) throws SQLException
	{
		
		for(int i=0;i<number;i++)
		{
			String insert="insert into mobiles(model,price,date_of_manufacture) values(?,?,?);";
			PreparedStatement pm=ConnectionDb.con.prepareStatement(insert);
			pm.setString(1, al.get(i).getModel());
			pm.setDouble(2, al.get(i).getPrice());
			pm.setString(3, al.get(i).getDateOfManufacture());
			pm.execute();
		}
	}
	public ArrayList<Mobile> displayMobiles() throws SQLException
	{
		String select="select * from mobiles";
		Statement st=ConnectionDb.con.createStatement();
		ResultSet rs=st.executeQuery(select);
		ArrayList<Mobile> al=new ArrayList<Mobile>();
		while(rs.next())
		{
			int id=rs.getInt("id");
			String model=rs.getString("model");
			double price=rs.getDouble("price");
			String date=rs.getString("date_of_manufacture");
			al.add(new Mobile(id,model,price,date));
		}
		return al;
	}
	public int updateMobilePrice(double price,String model) throws SQLException
	{
		String update="update mobiles set price=? where model=?";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(update);
		pm.setDouble(1, price);
		pm.setString(2, model);
		int updateCount=pm.executeUpdate();
		return updateCount;
	}
	public int deleteMobile(String model) throws SQLException
	{
		String delete="delete from mobiles where model=?";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(delete);
		pm.setString(1, model);
		int updateCount=pm.executeUpdate();
		return updateCount;
	}
	public void closeConnection() throws SQLException
	{
		try
		{
			ConnectionDb.con.close();
			System.out.println("connection closed!!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
