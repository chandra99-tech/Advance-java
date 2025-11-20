package service;

import java.time.LocalDate;
import java.util.List;

import bean.Employee;

public interface EmployeeService {

	boolean addEmployee();

	List<Employee> displayAll();

	boolean deleteEmployee(int eId);

	boolean modifyById(int eId, String eName, LocalDate ldt);

	Employee findById(int eId);

	List<Employee> displayAllAsce();

	void close();

}
