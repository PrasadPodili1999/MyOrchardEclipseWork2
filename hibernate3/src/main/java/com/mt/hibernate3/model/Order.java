package com.mt.hibernate3.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String customer;
	private float total;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private Set<OrderDetail> orderDetails=new HashSet<>();
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private Set<OrderPayment> orderPayments=new HashSet<>();
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Contact contact;
	

	public Order() {
		super();
	}

	public Order( String customer, float total) {
		super();
		
		this.customer = customer;
		this.total=total ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	public Set<OrderPayment> getOrderPayments() {
		return orderPayments;
	}

	public void setOrderPayments(Set<OrderPayment> orderPayments) {
		this.orderPayments = orderPayments;
	}

	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public void addOrderDetail(OrderDetail orderDetail)
	{
		this.orderDetails.add(orderDetail);
	}
	public void addOrderPayment(OrderPayment orderPayment)
	{
		this.orderPayments.add(orderPayment);
	}
	
}
