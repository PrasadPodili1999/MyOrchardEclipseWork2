package com.mt.msm.mobiledao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mt.msm.bo.Mobile;
import com.mt.msm.vo.MobileVo;

public interface MobileDao {
	
	public void initializeDb();
	public void addMobiles(ArrayList<MobileVo> al,int number) throws SQLException;
	public ArrayList<Mobile> displayMobiles() throws SQLException;
	public int updateMobilePrice(double price,String model) throws SQLException;
	public int deleteMobile(String model) throws SQLException;
	public void closeConnection() throws SQLException;

}
