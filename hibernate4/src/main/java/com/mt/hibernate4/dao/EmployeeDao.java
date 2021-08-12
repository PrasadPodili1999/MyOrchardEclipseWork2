package com.mt.hibernate4.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mt.hibernate4.model.Employee;
import com.mt.hibernate4.util.HibernateUtil;

public class EmployeeDao {

	
	//save employee
	public void saveEmployee(Employee emp)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			
			session.save(emp);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {

		Transaction transaction = null;
		List<Employee> em = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start transaction
			transaction = session.beginTransaction();

			// save employee object
			em = (List<Employee>)session.createQuery("SELECT E.name FROM Employee AS E").list();
			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		System.out.println(em);
		return em;
	}
	public void updateEmployee() {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			// start transaction
			transaction = session.beginTransaction();

			// save employee object
			//session.saveOrUpdate(em);
			Query query=session.createQuery("UPDATE Employee set ename=:name where id%2=1");
			//query.setParameter("name", "jackie");
			query.setParameter("name", "prasad");
			
			int result = query.executeUpdate();
			System.out.println("Rows affected: " + result);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	public void deleteEmployee(int id) {

		Transaction transaction = null;
		Employee em = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start transaction
			transaction = session.beginTransaction();

			// get employee object
			//em = session.get(Employee.class, id);

			// delete employee object
			//session.delete(em);
			Query query=session.createQuery("DELETE from  Employee where id=:id");
			//query.setParameter("name", "jackie");
			//query.setParameter("name", "prasad");
			query.setParameter("id", id);
			
			int result = query.executeUpdate();
			System.out.println("Rows affected: " + result);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
}
