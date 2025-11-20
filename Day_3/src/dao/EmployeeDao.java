package dao;

import java.time.LocalDate;
import java.util.List;

import bean.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> showAllData();

	boolean removeEmployee(int eId);

	boolean updateData(int eId, String eName, LocalDate ldt);

	Employee searchById(int eId);

	List<Employee> sortedOrder();

	void closes();

}
