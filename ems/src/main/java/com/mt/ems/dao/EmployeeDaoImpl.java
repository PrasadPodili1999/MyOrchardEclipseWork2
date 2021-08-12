package com.mt.ems.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mt.ems.bo.EmployeeBo;
import com.mt.ems.connection.ConnectionDb;
import com.mt.ems.vo.EmployeeVo;

public class EmployeeDaoImpl implements EmployeeDao{

	public void initializeDb() 
	{	
		try
		{
			Properties p=new Properties();
			FileInputStream fis=new FileInputStream("Connection.properties");
			p.load(fis);;
			ConnectionDb.con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("pwd"));
			System.out.println("DB Connected Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public int addEmployee(EmployeeVo emp) throws SQLException
	{
		String insert="insert into emp(name,age,salary) values(?,?,?);";
		//System.out.println(ConnectionDb.con);
		PreparedStatement pm=ConnectionDb.con.prepareStatement(insert);
		pm.setString(1,emp.getName());
		pm.setByte(2, emp.getAge());
		pm.setDouble(3, emp.getSalary());
		int updateCount=pm.executeUpdate();
		return updateCount;
	}
	public int addEmployee(List<EmployeeVo> empList) throws SQLException
	{
		String insert="insert into emp(name,age,salary) values(?,?,?);";
		int updateCount=0;
		for(EmployeeVo emp:empList)
		{
			PreparedStatement pm=ConnectionDb.con.prepareStatement(insert);
			pm.setString(1,emp.getName());
			pm.setByte(2, emp.getAge());
			pm.setDouble(3, emp.getSalary());
			updateCount=updateCount+pm.executeUpdate();
		}
		return updateCount;
	}
	public EmployeeBo displayEmployeeById(int id) throws SQLException
	{
		String select="select * from emp where id=?";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(select);
		pm.setInt(1, id);
		ResultSet rs=pm.executeQuery();
		if(rs.next())
		{
			EmployeeBo emp=new EmployeeBo(rs.getInt("id"), rs.getString("name"), rs.getByte("age"), rs.getDouble("salary"));
			return emp;
		}
		return null;
	}
	public List<EmployeeBo> displayAllEmployee() throws SQLException
	{
		String select="select * from emp";
		Statement st=ConnectionDb.con.createStatement();
		ResultSet rs=st.executeQuery(select);
		List<EmployeeBo> empList=new ArrayList<EmployeeBo>();
		while(rs.next())
		{
			empList.add(new EmployeeBo(rs.getInt("id"), rs.getString("name"), rs.getByte("age"), rs.getDouble("salary")));
		}
		return empList;
	}
	public int updateEmployeeSalary(int id,double sal) throws SQLException
	{
		String update="update emp set salary=? where id=?";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(update);
		pm.setInt(2, id);
		pm.setDouble(1, sal);
		int updateCount=pm.executeUpdate();
		return updateCount;
	}
	public int deleteEmployeeById(int id) throws SQLException
	{
		String delete="delete from emp where id=?";
		PreparedStatement pm=ConnectionDb.con.prepareStatement(delete);
		pm.setInt(1, id);
		int updateCount=pm.executeUpdate();
		return updateCount;
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
