package service;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import bean.*;

public class EmployeeServiceImpl implements EmployeeService {
        	private EmployeeDao edao;
	public EmployeeServiceImpl() {
				edao=new EmployeeDaoImpl();
				
			}
	@Override
	public boolean addEmployee() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee Id");
		 int eId=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter Employee Name");
		 String eName=sc.nextLine();
		 System.out.println("Enter Joining Date");
		 String dt=sc.next();
		 LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 Employee e=new Employee(eId,eName,ldt);
		 
		 return edao.save(e);
	}
	@Override
	public List<Employee> displayAll() {
		
		return edao.showAllData();
	}
	
	@Override
	public boolean deleteEmployee(int eId) {
		
		return edao.removeEmployee(eId);
	}
	
	@Override
	public boolean modifyById(int eId, String eName, LocalDate ldt) {
		return edao.updateData(eId,eName,ldt);
	}
	@Override
	public Employee findById(int eId) {
		
		return edao.searchById(eId);
	}
	@Override
	public List<Employee> displayAllAsce() {
		// TODO Auto-generated method stub
		return edao.sortedOrder();
	}
	@Override
	public void close() {
		edao.closes();
		
	}

}
