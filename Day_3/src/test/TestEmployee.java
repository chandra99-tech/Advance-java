package test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice;
		
		do {
			System.out.println();
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
				case 1 ->{
					boolean status=eservice.addEmployee();
					if(status) {
						System.out.println("Employee Data added Successfully");
					}
					else {
						System.err.println("Error in Data Adding");
					}
				}
				case 2 ->{
					System.out.println("Enter Employee ID to Delete");
					int eId=sc.nextInt();
					boolean status=eservice.deleteEmployee(eId);
					if(status) {
						System.out.println("Employee Data Deleted");
					}
					else {
						System.err.println("Error in Deleting data");
					}
						
				}
				case 3 ->{
						System.out.println("Enter Id");
						int eId=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Name");
						String eName=sc.nextLine();
						System.out.println("Enter Date ");
						String date=sc.nextLine();
						LocalDate ldt = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
						boolean status=eservice.modifyById(eId,eName,ldt);
						if(status) {
							System.out.println("Data Modify Successfully");
						}
						else {
							System.out.println("Error in Modify data");
						}
				}
				case 4 ->{
						System.out.println("Enter Id ");
						int eId=sc.nextInt();
						Employee E=eservice.findById(eId);
						if(E==null) {
							System.out.println("Id Found ");
						}else {
							System.out.println(E);
						}
				}
				case 5 ->{
					List<Employee>elist=eservice.displayAll();
					elist.forEach(System.out::println);
					
						
				}
				case 6 ->{
					List<Employee>elist=eservice.displayAllAsce();
					elist.forEach(System.out::println);
						
				}
				case 7 ->{
					sc.close();
					eservice.close();
					System.out.println("---Thank You For Visiting, Please Visit Again!---");
				}
				default ->{
					System.out.println("----Please Enter Valid Choice!----");
					System.out.println("---------------------------------------");
					System.out.println();
				}
			}
		}while(choice!=7);
		

	}

}
