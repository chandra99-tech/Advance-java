package service;

import java.util.List;

import beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> getAllProducts();

	boolean deleteProduct(int pid);

	void closeMyConnection();

	boolean modifyById(int pId, String pname, int price);

	Product findById(int pId);

	List<Product> sortByPrice();

}
