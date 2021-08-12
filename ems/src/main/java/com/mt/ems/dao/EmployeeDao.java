package com.mt.ems.dao;

import java.sql.SQLException;
import java.util.List;

import com.mt.ems.bo.EmployeeBo;
import com.mt.ems.vo.EmployeeVo;

public interface EmployeeDao {

	public void initializeDb();
	public int addEmployee(EmployeeVo emp) throws SQLException;
	public int addEmployee(List<EmployeeVo> empList) throws SQLException;
	public EmployeeBo displayEmployeeById(int id) throws SQLException;
	public List<EmployeeBo> displayAllEmployee() throws SQLException;
	public int updateEmployeeSalary(int id,double sal) throws SQLException;
	public int deleteEmployeeById(int id) throws SQLException;
	public void closeConnection();
}
