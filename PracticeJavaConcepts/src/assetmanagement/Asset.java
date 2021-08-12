package assetmanagement;

public class Asset {

	private int sNo;
	private String model;
	private String allottedMonth;
	private int quantity;

	public Asset() {

	}

	public Asset(int sNo, String model, String allottedMonth, int quantity) {
		super();
		this.sNo = sNo;
		this.model = model;
		this.allottedMonth = allottedMonth;
		this.quantity = quantity;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAllottedMonth() {
		return allottedMonth;
	}

	public void setAllottedMonth(String allottedMonth) {
		this.allottedMonth = allottedMonth;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
