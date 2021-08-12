package com.mt.oms.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mt.oms.bo.Mobile;
import com.mt.oms.connection.ConnectionDb;
import com.mt.oms.vo.Order;



public class OrdersDaoImpl implements OrdersDao{

	public void initializeDb()
	{
		try
		{
			ConnectionDb.con=DriverManager.getConnection(ConnectionDb.url,ConnectionDb.username,ConnectionDb.pwd);
			//System.out.println("DB Connected Successfully");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public int addOrder(Order order) throws SQLException
	{
		String insert="insert into orders(mid,cid,qty) values(?,?,?);";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(insert);
		pm.setInt(1, order.getMid());
		pm.setInt(2,order.getCid());
		pm.setInt(3, order.getQty());
		int updateCount=pm.executeUpdate();
		return updateCount;
	}
	public int checkQuantity(int mid) throws SQLException
	{
		String select="select stock from mobiles where mid=?";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(select);
		pm.setInt(1, mid);
		ResultSet rs=pm.executeQuery();
		rs.next();
		return rs.getInt("stock");
	}
	public Mobile displayMobileByBrand(String brand) throws SQLException
	{
		String select="select * from mobiles where brand=?";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(select);
		pm.setString(1, brand);
		ResultSet rs=pm.executeQuery();
		if(rs.next())
		{
			Mobile mobile=new Mobile(rs.getInt("mid"),rs.getString("brand"),rs.getDouble("price"),rs.getInt("stock"));
			return mobile;
		}
		return null;
	}
	public ArrayList<Mobile> displayAllMobiles() throws SQLException
	{
		String select="select * from mobiles";
		Statement st=ConnectionDb.con.createStatement();
		ResultSet rs=st.executeQuery(select);
		ArrayList<Mobile> mobiles=new ArrayList<>();
		while(rs.next())
		{
			mobiles.add(new Mobile(rs.getInt("mid"),rs.getString("brand"),rs.getDouble("price"),rs.getInt("stock")));
		}
		return mobiles;
	}
	public void closeConnection()
	{
		try
		{
			ConnectionDb.con.close();
			System.out.println("connection closed");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
