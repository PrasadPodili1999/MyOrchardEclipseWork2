package com.mt.ordermanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_items")
public class OrderItem {

	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="item_num")
	private Item item;
	
	@Column(name="no_of_items_ordered")
	private int noOfItemsOrdered;

	/*public OrderItem() {
		super();
	}*/

	public OrderItem(Order order, Item item, int noOfItemsOrdered) {
		super();
		this.order = order;
		this.item = item;
		this.noOfItemsOrdered = noOfItemsOrdered;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getNoOfItemsOrdered() {
		return noOfItemsOrdered;
	}

	public void setNoOfItemsOrdered(int noOfItemsOrdered) {
		this.noOfItemsOrdered = noOfItemsOrdered;
	}

	
	
	
}
