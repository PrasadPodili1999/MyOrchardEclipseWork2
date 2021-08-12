package com.mt.oms.vo;

public class Order {

	private int cid;
	private int mid;
	private int qty;
	public Order() {
		super();
	}
	public Order(int cid, int mid, int qty) {
		super();
		this.cid = cid;
		this.mid = mid;
		this.qty = qty;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
