package com.mt.hibernate3.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mt.hibernate3.model.Contact;
import com.mt.hibernate3.model.Order;
import com.mt.hibernate3.model.OrderDetail;
import com.mt.hibernate3.model.OrderPayment;
import com.mt.hibernate3.model.Payment;
import com.mt.hibernate3.model.Product;

public class OrderApp {

	public static void main(String[] args) {
		
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		SessionFactory factory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
		
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		Product product1=new Product("iphone", 200);
		Product product2=new Product("lenovo", 50);
		
		Payment payment1=new Payment("gpay", "paid");
		Payment payment2=new Payment("phonePe", "failed");
		
		Order order1=new Order( "prasad", 200);
		Order order2=new Order( "madhu", 500);
		
		Contact contact1=new Contact("jackie", "shop street", "puttur", "ap", "india", 517583, 1111100011);
		
		OrderDetail orderDetail1=new OrderDetail(product1, order1, 1000, 24);
		OrderDetail orderDetail2=new OrderDetail(product2, order2, 2000, 56);
		
		OrderPayment orderPayment1=new OrderPayment(payment1, order1, 150);
		OrderPayment orderPayment2=new OrderPayment(payment2, order2, 507);
		
		order1.addOrderDetail(orderDetail1);
		order2.addOrderDetail(orderDetail2);
		order1.addOrderPayment(orderPayment1);
		order2.addOrderPayment(orderPayment2);
		order1.setContact(contact1);
		order2.setContact(contact1);
		
		session.save(order1);
		session.save(order2);
		
		session.close();
		factory.close();

	}

}
