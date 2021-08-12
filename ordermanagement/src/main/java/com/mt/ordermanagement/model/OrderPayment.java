package com.mt.ordermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_payments")
public class OrderPayment {

	@Id
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="payment_type")
	private String paymentType;
	private double amount;
	public OrderPayment() {
		super();
	}
	public OrderPayment(int orderId, String paymentType, double amount) {
		super();
		this.orderId = orderId;
		this.paymentType = paymentType;
		this.amount = amount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
