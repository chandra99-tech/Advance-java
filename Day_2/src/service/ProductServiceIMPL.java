package service;

import java.util.*;

import dao.ProductDao;
import dao.ProductDaoIMPL;
import beans.Product;

public class ProductServiceIMPL implements ProductService {
	
	private ProductDao pdao;
	
	

	public ProductServiceIMPL() {
		pdao = new ProductDaoIMPL();
	}



	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details Of Product To Add");
		System.out.println();
		System.out.println("Enter Product Id :");
		int prodId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Prouct Name :");
		String pname = sc.nextLine();
		System.out.println("Enter Product Price :");
		int price = sc.nextInt();
		
		Product p = new Product(prodId,pname,price);
		return pdao.save(p);
		
	}



	@Override
	public List<Product> getAllProducts() {
		return pdao.displayAllProduct();
	}



	@Override
	public boolean deleteProduct(int pid) {
		
		return pdao.removeProduct(pid);
	}



	@Override
	public void closeMyConnection() {
		 pdao.closeConnection();
		
	}



	@Override
	public boolean modifyById(int pId, String pname, int price) {
		return pdao.updateById(pId,pname,price);
	}



	@Override
	public Product findById(int pId) {
		
		return pdao.searchById(pId);
	}



	@Override
	public List<Product> sortByPrice() {
		return pdao.arrangeByPrice();
	}

}
