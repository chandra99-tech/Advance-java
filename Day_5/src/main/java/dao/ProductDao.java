package dao;

import java.util.List;

import beans.Product;

public interface ProductDao {

	List<Product> getAllProduct();

	boolean save(Product p);

}
