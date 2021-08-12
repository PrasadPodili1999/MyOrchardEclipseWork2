package com.mt.hibernate3.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {

	@Id
	@Column(name="payment_type")
	private String paymentType;
	
	@Column(name="des")
	private String description;
	
	@OneToMany(mappedBy="payment")
	private Set<OrderPayment> orderPayments=new HashSet<>();

	public Payment() {
		super();
	}

	public Payment(String paymentType, String description) {
		super();
		this.paymentType = paymentType;
		this.description = description;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
