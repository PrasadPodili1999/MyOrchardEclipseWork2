package com.mt.ordermanagement.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.mt.ordermanagement.model.ContactDetails;
import com.mt.ordermanagement.model.Item;
import com.mt.ordermanagement.model.Order;
import com.mt.ordermanagement.model.OrderItem;
import com.mt.ordermanagement.model.Payment;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		
		if(sessionFactory==null)
		{
			try
			{
				Configuration configuration=new Configuration();
				
				//settings equivalent to hibernate.cfg.xml properties
				Properties settings=new Properties();
				settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/orders");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "2587");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				
				settings.put(Environment.SHOW_SQL, "true");
				//settings.put.(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
				settings.put(Environment.HBM2DDL_AUTO, "create-drop");
				
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Item.class)
					.addAnnotatedClass(Order.class)
					.addAnnotatedClass(OrderItem.class);
				ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory= configuration.buildSessionFactory(serviceRegistry);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		return sessionFactory;
	}
}
