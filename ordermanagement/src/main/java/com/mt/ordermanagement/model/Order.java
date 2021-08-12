package com.mt.ordermanagement.model;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@Column(name="order_date")
	private String date;
	
	//@Column(name="ship_to_contact_id")
	//private int contactId;
	
	@OneToMany(mappedBy="orders",cascade=CascadeType.ALL)
	private HashSet<OrderItem> oi=new HashSet<>();

	public Order() {
		super();
	}

	
	public Order(String date) {
		super();
		this.date = date;
		//this.oi = oi;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public HashSet<OrderItem> getOi() {
		return oi;
	}


	public void setOi(HashSet<OrderItem> oi) {
		this.oi = oi;
	}


	public void addOrderItem(OrderItem orderItem)
	{
		oi.add(orderItem);
	}
	/*public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}*/
	
	
}
