package jdbcpractice1;

import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		SqlImpl obj1=new SqlImpl();
		obj1.initializeDb();
		try
		{
			//obj1.addEmp(3, "jackie", 35060, "aiArchitect");
			obj1.getAllEmp();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
