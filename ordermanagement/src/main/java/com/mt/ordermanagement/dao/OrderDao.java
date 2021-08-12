package com.mt.ordermanagement.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mt.ordermanagement.util.HibernateUtil;



public class OrderDao {

	public static void saveOrder(Object obj)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			session.save(obj);
			transaction.commit();
		}
		catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}
}
