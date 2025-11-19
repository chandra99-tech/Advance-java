package beans;

public class Product {
	int prodID;
	String desc;
	int price;
	
	public Product(int prodID, String desc, int price) {
		this.prodID = prodID;
		this.desc = desc;
		this.price = price;
	}

	public Product() {
		super();	
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodID=" + prodID + ", desc=" + desc + ", price=" + price + "]";
	}
	
	
	
	
}
