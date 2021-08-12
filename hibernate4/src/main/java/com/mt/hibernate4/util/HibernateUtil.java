package com.mt.hibernate4.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	
	    private static SessionFactory sessionFactory;
	     
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            // loads configuration and mappings
	        	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	    		
	    		sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
	             
	            // builds a session factory from the service registry
	            //sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
	        }
	         
	        return sessionFactory;
	    }
	
}
