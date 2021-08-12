package com.mt.ordermanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mt.ordermanagement.dao.OrderDao;
import com.mt.ordermanagement.model.Item;
import com.mt.ordermanagement.model.Order;
import com.mt.ordermanagement.model.OrderItem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
    	//SessionFactory factory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	//Session session=factory.openSession();
        OrderDao orderDao=new OrderDao();
        
        Item item1=new Item("mango", 120);
        Item item2=new Item("grapes",240);
        
        Order order=new Order("2019-09-08");
        
        OrderItem oi1=new OrderItem(order, item1, 5);
        OrderItem oi2=new OrderItem(order, item2, 10);
        
        order.addOrderItem(oi1);
        order.addOrderItem(oi2);
        orderDao.saveOrder(order);
    }
}
