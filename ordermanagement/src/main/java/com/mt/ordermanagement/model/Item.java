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
@Table(name="items")
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_number")
	private int itemNum;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_price")
	private int itemPrice;
	
	@OneToMany(mappedBy="items",cascade=CascadeType.ALL)
	private HashSet<OrderItem> oi=new HashSet<>();

	public Item() {
		super();
	}

	public Item( String itemName, int itemPrice) {
		super();
		
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
