package jdbcpractice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1.import 
 * 2.load and register
 * 3.establish the connection
 * 4.create stmt
 * 5.execute query
 * 6.process query
 * 7.close connection
 */
public class SqlImpl implements Dao {

	private String url="jdbc:mysql://localhost:3306/practice";
	private String username="root";
	private String pwd="2587";
	private Connection con;
	
	@Override
	public void initializeDb()
	{
		//register Driver to Drivermanager and get DB Connection
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pwd);
			System.out.println("connected successfully");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void addEmp(int eid,String ename,double sal,String job) throws SQLException
	{
		/*
		 * 1.prepare stmt(insert query)
		 * 2.execute query
		 * 3.process the result
		 */
		String insertQuery="insert into emp values(?,?,?,?);";
		PreparedStatement pm=con.prepareStatement(insertQuery);		
		pm.setInt(1, eid);
		pm.setString(2, ename);
		pm.setDouble(3, sal);
		pm.setString(4, job);
		pm.execute();
		System.out.println("data added to db");
	}
	
	@Override
	public void getEmp(int eid) throws SQLException
	{
		/*
		 * 1.prepare stmt(select query)
		 * 2.execute query
		 * 3.process the result
		 */
		String selectQuery="select * from emp where eid=?";
		PreparedStatement pm=con.prepareStatement(selectQuery);
		pm.setInt(1, eid);
		ResultSet rs=pm.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("eid");
			String name=rs.getString("ename");
			double salary=rs.getDouble("sal");
			String job1=rs.getString("job");
			System.out.println(id+" "+name+" "+salary+" "+job1);
			
		}
	}
	
	@Override
	public void getAllEmp() throws SQLException
	{
		/*
		 * 1.prepare stmt(select query)
		 * 2.execute query
		 * 3.process the result
		 */
		String selectQuery="select * from emp";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(selectQuery);
		while(rs.next())
		{
			int id=rs.getInt("eid");
			String name=rs.getString("ename");
			double salary=rs.getDouble("sal");
			String job1=rs.getString("job");
			System.out.println(id+"\t|"+name+"\t|"+salary+"\t|"+job1);
		}
	}
	
	@Override
	public void updateEmpName(int id,String name) throws SQLException
	{
		/*
		 * 1.prepare stmt(update query)
		 * 2.execute query
		 * 3.process the result
		 */
		String updateQuery="update emp set ename=? where eid=?";
		PreparedStatement pm=con.prepareStatement(updateQuery);
		pm.setString(1, name);
		pm.setInt(2, id);
		int updateCount= pm.executeUpdate();
		System.out.println(updateCount+" rows updated");
	}
	
	@Override
	public void deleteEmp(int id) throws SQLException
	{
		/*
		 * 1.prepare stmt(delete query)
		 * 2.execute query
		 * 3.process the result
		 */
		String deleteQuery="delete from emp where id=?";
		PreparedStatement pm=con.prepareStatement(deleteQuery);
		pm.setInt(1, id);
		int updateCount=pm.executeUpdate();
		System.out.println(updateCount+" rows affected");
	}
	
	@Override
	public void closeConnection()
	{
		try
		{
			con.close();
			System.out.println("connection closed");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
