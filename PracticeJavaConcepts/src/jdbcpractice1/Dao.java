package jdbcpractice1;

import java.sql.SQLException;

public interface Dao {
	
	public void initializeDb();
	public void addEmp(int eid,String ename,double sal,String job) throws SQLException;
	public void getEmp(int eid) throws SQLException;
	public void getAllEmp() throws SQLException;
	public void updateEmpName(int id,String name) throws SQLException;
	public void deleteEmp(int id) throws SQLException;
	public void closeConnection();
}
