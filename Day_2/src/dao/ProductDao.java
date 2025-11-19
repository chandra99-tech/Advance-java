package dao;

import java.util.List;

import beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> displayAllProduct();

	boolean removeProduct(int pid);

	void closeConnection();

	boolean updateById(int pId, String pname, int price);

	Product searchById(int pId);

	List<Product> arrangeByPrice();

}
