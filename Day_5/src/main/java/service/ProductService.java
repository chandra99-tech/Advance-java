package service;

import java.util.List;

import beans.Product;

public interface ProductService {

	List<Product> displayAllProduct();

	boolean addNewProduct(Product p);

}
