package com.mt.oms.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mt.oms.bo.Mobile;
import com.mt.oms.vo.Order;

public interface OrdersDao {

	public void initializeDb();
	public int addOrder(Order order) throws SQLException;
	public Mobile displayMobileByBrand(String brand) throws SQLException;
	public ArrayList<Mobile> displayAllMobiles() throws SQLException;
	public void closeConnection();
}
