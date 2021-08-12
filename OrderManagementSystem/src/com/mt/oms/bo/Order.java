package com.mt.oms.bo;

public class Order {

	private int id;
	private int mid;
	private int cid;
	private int qty;
	public Order() {
		super();
	}
	public Order(int mid, int cid, int qty) {
		super();
		this.mid = mid;
		this.cid = cid;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", mid=" + mid + ", cid=" + cid + ", qty=" + qty + "]";
	}
	
}
