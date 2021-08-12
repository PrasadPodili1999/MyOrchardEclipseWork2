package com.mt.hibernate2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mt.hibernate2.model.Employee;
import com.mt.hibernate2.util.HibernateUtil;

public class EmployeeDao {

	// save employee
	// get all emp
	// get emp by id
	// update emp
	// delete emp

	public void saveEmployee(Employee em) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start transaction
			transaction = session.beginTransaction();

			// save employee object
			session.save(em);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	public void updateEmployee(Employee em) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			// start transaction
			transaction = session.beginTransaction();

			// save employee object
			session.saveOrUpdate(em);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	public Employee getEmployeeById(int id) {

		Transaction transaction = null;
		Employee em = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			// start transaction
			transaction = session.beginTransaction();

			// get employee object
			em = session.get(Employee.class, id);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return em;
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
			em = (List<Employee>)session.createQuery("from Employee").list();
			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return em;
	}

	public void deleteEmployee(int id) {

		Transaction transaction = null;
		Employee em = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start transaction
			transaction = session.beginTransaction();

			// get employee object
			em = session.get(Employee.class, id);

			// delete employee object
			session.delete(em);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
}
