package service;

import java.util.List;

import beans.Product;
import dao.ProductDao;
import dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao pdao;
	
	
	
	public ProductServiceImpl() {
		pdao= new ProductDaoImpl();
	}



	@Override
	public List<Product> displayAllProduct() {
		return pdao.getAllProduct();
	}



	@Override
	public boolean addNewProduct(Product p) {
		return pdao.save(p);
	}

}
