package beans;

import java.time.LocalDate;

public class Product {
	int pId;
	String pname;
	int qty;
	double price;
	LocalDate expdate;
	int cId;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int pId, String pname, int qty, double price, LocalDate expdate, int cId) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.expdate = expdate;
		this.cId = cId;
	}
	
	


	public Product(String pname, int qty, double price, LocalDate expdate, int cId) {
		super();
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.expdate = expdate;
		this.cId = cId;
	}


	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public LocalDate getExpdate() {
		return expdate;
	}
	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}
	
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", expdate=" + expdate
				+ ", cId=" + cId + "]";
	}
	
	
}
