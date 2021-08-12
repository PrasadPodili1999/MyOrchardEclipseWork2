package com.mt.hibernate1.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mt.hibernate1.model.Student;
import com.mt.hibernate1.util.HibernateUtil;

public class StudentDao {

	public static void saveStudent(Student student)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
		}
		catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}
}
