package test;

import java.util.*;

import beans.Product;
import service.ProductService;
import service.ProductServiceIMPL;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService pservice = new ProductServiceIMPL();
		int choice;
		do {
			System.out.println("1. Add New Product");
			System.out.println("2. Delete A Product");
			System.out.println("3. Modify A Product");
			System.out.println("4. Find By ID");
			System.out.println("5. Display All Product");
			System.out.println("6.Display in Sorted Order");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 -> {
					boolean status = pservice.addNewProduct();
					if(status) {
						System.out.println("Product Added Successfully!");
					}
					else {
						System.err.println("Error Adding Product");
					}
					System.out.println("-----------------------------------------------");
					System.out.println();
				}
				
				case 2 -> {
					System.out.println("Enter Product Id To Delete Product:");
					int pid=sc.nextInt();
					boolean status=pservice.deleteProduct(pid);
					if(status) {
						System.out.println("Product Deleted Successfully!");
					}
					else {
						System.err.println("Error in Deleting Product");
					}
					System.out.println("-----------------------------------------------");
					System.out.println();
				}
				
				case 3 -> {
					System.out.println("Enter Product Id To Be Modify");
					int pId=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Product Name");
					String pname=sc.nextLine();
					System.out.println("Enter Product Price");
					int price=sc.nextInt();
					boolean status =pservice.modifyById(pId,pname,price);
					if(status) {
						System.out.println("Product Modified Successfully!");
					}
					else {
						System.err.println("Error in Moifying Product");
					}
					System.out.println("-----------------------------------------------");
					System.out.println();
				}
				
				case 4 -> {
					System.out.println("Enter Product ID To Find Product");
					int pId=sc.nextInt();
					Product P =pservice.findById(pId);
					if(P==null) {
						System.err.println("Product Not Found");
					}
					else {
						System.out.println(P);
					}
					System.out.println("-----------------------------------------------");
					System.out.println();
				}
				
				case 5 -> {
					List<Product> plst = pservice.getAllProducts();
					plst.forEach(System.out::println);
					System.out.println("-----------------------------------------------");
					System.out.println();
				}
				
				case 6 -> {
					List<Product> plst = pservice.sortByPrice();
					plst.forEach(System.out::println);
					System.out.println("-----------------------------------------------");
					System.out.println();
				}
				
				case 7 -> {
					sc.close();
					pservice.closeMyConnection();
					System.out.println("-----Thank You For Visting!-----");
				}
				
				default -> {
					System.out.println("---Please Enter Valid Choice!---");
					System.out.println("-----------------------------------------------");
					System.out.println();
				}
			}
		}while(choice!=7);

	}

}
