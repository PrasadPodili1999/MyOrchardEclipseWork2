package com.mt.oms.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.mt.oms.dao.OrdersDaoImpl;
import com.mt.oms.vo.Order;

public class AddOrder {

	public static void addOrder() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer id : ");
		int cid=sc.nextInt();
		System.out.println("enter mobile id : ");
		int mid=sc.nextInt();
		System.out.println("enter howmuch quantity you want to order : ");
		int qty=sc.nextInt();
		int stock=new OrdersDaoImpl().checkQuantity(mid);
		if(qty<=stock)
		{
			Order order=new Order(cid, mid, qty);
			int result=new OrdersDaoImpl().addOrder(order);
			if(result!=0)
			{
				System.out.println("order placed successfully");
			}
		}
		else
		{
			String s="Stock not available. \nCurrent stock : "+stock;
			throw new StockNotAvailableException(s);
		}
	}
}

class StockNotAvailableException extends Exception
{
	public StockNotAvailableException(String s)
	{
		super(s);
	}
}
